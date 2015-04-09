package dialogicallogic.dsl.scope;

public interface TermScope extends EndScope {
    FormulaScope and(String term);
    FormulaScope or(String term);
    FormulaScope andNot(String term);
    FormulaScope orNot(String term);
}
