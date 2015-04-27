package dialogicallogic.dsl.scope;

import dialogicallogic.dsl.model.MolecularStatement;
import dialogicallogic.dsl.model.Statement;

public interface ConnectiveScope extends EndScope {
    ConnectiveScope and(Statement statement);
    ConnectiveScope or(Statement statement);
    ConnectiveScope andNot(Statement statement);
    ConnectiveScope orNot(Statement statement);
}
