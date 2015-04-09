package dialogicallogic.dsl;

import org.junit.Test;

import static dialogicallogic.dsl.DialogicalLogic.*;

public class DialogicalLogicExplorationTest {

    @Test
    void basics() {
        is("raining").stop();

        not("raining").stop();

        not(is("hot").and("wet")).stop();
    }

    @Test
    void junctors() {
        is("raining").and("cool").stop();
        not("raining").or("hot").stop();

        when("raining").then("wet").stop();
        when("hot").thenNot("wet").stop();

        // hot -> (wet and irrational)
        when("hot").then("wet").and("irrational").stop();

        when(not("raining").and("hot")).then(is("unknown").and("creepy")).stop();

        is("hot").andNot("raining").stop();

        not(is("wet").or("hot")).stop();

        is(is("wet").and("cool")).stop();
    }

}