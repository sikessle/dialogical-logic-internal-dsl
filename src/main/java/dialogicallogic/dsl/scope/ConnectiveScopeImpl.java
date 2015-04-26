package dialogicallogic.dsl.scope;

import dialogicallogic.dsl.model.AtomicStatement;
import dialogicallogic.dsl.model.Connective;
import dialogicallogic.dsl.model.MolecularStatement;
import dialogicallogic.dsl.model.Statement;

import java.util.ArrayList;
import java.util.List;

public class ConnectiveScopeImpl implements ConnectiveScope {

    private List<Statement> statements;
    private List<Connective> connectives;

    public ConnectiveScopeImpl(Statement startStatement) {
        statements = new ArrayList<>();
        connectives = new ArrayList<>();

        statements.add(startStatement);
    }

    @Override
    public ConnectiveScope and(Statement statement) {
        statements.add(statement);
        connectives.add(Connective.AND);
        return this;
    }

    @Override
    public ConnectiveScope or(Statement statement) {
        statements.add(statement);
        connectives.add(Connective.OR);
        return this;
    }

    @Override
    public ConnectiveScope andNot(Statement statement) {
        statement.setNegated(true);
        statements.add(statement);
        connectives.add(Connective.AND);
        return this;
    }

    @Override
    public ConnectiveScope orNot(Statement statement) {
        statement.setNegated(true);
        statements.add(statement);
        connectives.add(Connective.OR);
        return this;
    }

    @Override
    public MolecularStatement e() {
        return new MolecularStatement(statements, connectives, false);
    }

}
