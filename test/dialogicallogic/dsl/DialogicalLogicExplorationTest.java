package dialogicallogic.dsl;

import org.junit.Test;

import static dialogicallogic.dsl.DialogicalLogic.*;

public class DialogicalLogicExplorationTest {

    @Test
    void basics() {
        is("raining").stop();

        isNot("raining").stop();

        isNot(is("hot").and("wet")).stop();
    }

    @Test
    void junctors() {
        is("raining").and("cool").stop();
        isNot("raining").or("hot").stop();

        when("raining").then("wet").stop();
        when("hot").thenNot("wet").stop();

        // hot -> (wet and irrational)
        when("hot").then("wet").and("irrational").stop();

        when(isNot("raining").and("hot")).then(is("unknown").and("creepy")).stop();

        is("hot").andNot("raining").stop();

        isNot(is("wet").or("hot")).stop();

        is(is("wet").and("cool")).stop();

        // STOP not allwed!!
        when("x").stop();

        isNot(is("cool").and("hot")).stop();
    }

}