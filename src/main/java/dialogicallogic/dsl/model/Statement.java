package dialogicallogic.dsl.model;

public abstract class Statement {

    private boolean negated;

    public Statement(boolean negated) {
        this.negated = negated;
    }

    public final boolean isNegated() {
        return negated;
    }

    public final void setNegated(boolean negated) {
        this.negated = negated;
    }

    @Override
    public String toString() {
        return negated ? "\u00AC" : "";
    }
}
