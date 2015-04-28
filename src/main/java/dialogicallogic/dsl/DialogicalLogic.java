package dialogicallogic.dsl;

import dialogicallogic.dsl.model.AtomicStatement;
import dialogicallogic.dsl.model.Statement;
import dialogicallogic.dsl.scope.ConnectiveScope;
import dialogicallogic.dsl.scope.ConnectiveScopeImpl;
import dialogicallogic.dsl.scope.ImplicationScope;
import dialogicallogic.dsl.scope.ImplicationScopeImpl;

/**
 * Contains the starting methods
 */
public final class DialogicalLogic {

    private DialogicalLogic() {
        throw new AssertionError("static class");
    }

    public static Statement s(String statement) {
        return new AtomicStatement(statement, false);
    }

    public static ConnectiveScope is(Statement statement) {
        return new ConnectiveScopeImpl(statement);
    }

    public static ConnectiveScope isNot(Statement statement) {
        statement.setNegated(true);
        return new ConnectiveScopeImpl(statement);
    }

    public static ImplicationScope when(Statement statement) {
        return new ImplicationScopeImpl(statement);
    }

    public static ImplicationScope whenNot(Statement statement) {
        statement.setNegated(true);
        return new ImplicationScopeImpl(statement);
    }
}
