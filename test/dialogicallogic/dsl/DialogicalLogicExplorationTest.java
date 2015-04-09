package dialogicallogic.dsl;

import dialogicallogic.dsl.scope.FormulaScope;
import org.junit.Test;

import static dialogicallogic.dsl.DialogicalLogic.*;
import static org.junit.Assert.*;

public class DialogicalLogicExplorationTest {

    @Test
    void basics() {
        is("raining").end();

        not("raining").end();

        not(is("hot").and("wet"));
    }


    @Test
    void junctors() {
        is("raining").and("cool").end();
        not("raining").or("hot").end();

        when("raining").then("wet").end();
        when("hot").thenNot("wet").end();

        // hot -> (wet and irrational)
        when("hot").then("wet").and("irrational");
    }

}