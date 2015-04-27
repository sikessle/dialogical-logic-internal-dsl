package dialogicallogic.dsl.model;

public class AtomicStatement extends Statement {
    private final String statement;

    public AtomicStatement(String statement, boolean negated) {
        super(negated);
        this.statement = statement;
    }

    public String getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return super.toString() + statement;
    }

    @Override
    public String getString() {
        return toString();
    }
}
