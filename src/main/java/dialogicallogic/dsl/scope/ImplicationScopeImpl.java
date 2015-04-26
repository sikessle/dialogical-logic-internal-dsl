package dialogicallogic.dsl.scope;

import dialogicallogic.dsl.model.Connective;
import dialogicallogic.dsl.model.MolecularStatement;
import dialogicallogic.dsl.model.Statement;

import java.util.Arrays;

public class ImplicationScopeImpl implements ImplicationScope {

    private Statement whenStatement;

    public ImplicationScopeImpl(Statement whenStatement) {
        this.whenStatement = whenStatement;
    }

    @Override
    public ConnectiveScope then(Statement thenStatement) {
        Statement implicationStatement = createImplicationStatement(thenStatement);

        return new ConnectiveScopeImpl(implicationStatement);
    }

    @Override
    public ConnectiveScope thenNot(Statement thenStatement) {
        thenStatement.setNegated(true);
        Statement implicationStatement = createImplicationStatement(thenStatement);

        return new ConnectiveScopeImpl(implicationStatement);
    }

    private Statement createImplicationStatement(Statement thenStatement) {
        Statement[] stmts = {whenStatement, thenStatement};
        Connective[] connective = {Connective.IMPLICATION};

        return new MolecularStatement(Arrays.asList(stmts), Arrays.asList(connective), false);
    }
}
