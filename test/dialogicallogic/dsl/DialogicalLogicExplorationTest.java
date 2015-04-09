package dialogicallogic.dsl;

import org.junit.Test;

import static dialogicallogic.dsl.DialogicalLogic.*;

public class DialogicalLogicExplorationTest {

    @Test
    void basics() {
        is("raining").end();

        isNot("raining").end();

        isNot(is("hot").and("wet")).end();
    }

    @Test
    void junctors() {
        is("raining").and("cool").end();
        isNot("raining").or("hot").end();

        when("raining").then("wet").end();
        when("hot").thenNot("wet").end();

        // (hot -> wet) and irrational)
        when("hot").then("wet").and("irrational").end();

        // hot -> (wet and irrational)
        when("hot").then(is("wet").and("irrational")).end();

        when(isNot("raining").and("hot")).then(is("unknown").and("creepy")).end();

        is("hot").andNot("raining").end();

        isNot(is("wet").or("hot")).end();

        is(is("wet").and("cool")).end();

        isNot(is("cool").and("hot")).end().eval();
    }

}