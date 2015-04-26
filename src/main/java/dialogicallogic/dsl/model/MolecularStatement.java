package dialogicallogic.dsl.model;

import java.util.List;

public class MolecularStatement extends Statement {

    private List<Statement> statements;
    private List<Connective> connectives;

    public MolecularStatement(List<Statement> statements, List<Connective> connectives, boolean negated) {
        super(negated);
        if (connectives.size() != statements.size() - 1) {
            throw new IllegalArgumentException("n statements must have exactly n-1 connectives");
        }
        this.statements = statements;
        this.connectives = connectives;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<Connective> getConnectives() {
        return connectives;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < statements.size(); i++) {
            sb.append(statements.get(i).toString());
            if (i < statements.size() - 1) {
                sb.append(" ");
                sb.append(connectives.get(i).toString());
                sb.append(" ");
            }
        }

        return super.toString() + sb.toString();
    }
}
