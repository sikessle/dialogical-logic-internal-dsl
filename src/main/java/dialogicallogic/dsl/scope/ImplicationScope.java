package dialogicallogic.dsl.scope;


import dialogicallogic.dsl.model.Statement;

public interface ImplicationScope extends Scope {
    ConnectiveScope then(Statement statement);

    ConnectiveScope thenNot(Statement statement);
}
