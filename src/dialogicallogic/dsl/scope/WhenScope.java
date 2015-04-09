package dialogicallogic.dsl.scope;

import java.text.Normalizer;

public interface WhenScope extends EndScope {
    FormulaScope then(String term);

    FormulaScope thenNot(String term);

}
