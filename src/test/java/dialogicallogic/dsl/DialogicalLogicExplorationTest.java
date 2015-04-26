package dialogicallogic.dsl;

import org.junit.Test;


import static dialogicallogic.dsl.DialogicalLogic.*;

public class DialogicalLogicExplorationTest {

    @Test
    public void basics() {
        is(s("raining")).e();

        isNot(s("raining")).e();

        isNot(is(s("hot")).and(s("wet")).e()).e();

    }

    @Test
    public void connectives() {
        is(s("raining")).and(s("cool")).e();
        isNot(s("raining")).or(s("hot")).e();

        when(s("raining")).then(s("wet")).e();
        when(s("hot")).thenNot(s("wet")).e();

        // (hot -> wet) and irrational)
        when(s("hot")).then(s("wet")).and(s("irrational")).e();

        // hot -> (wet and irrational)
        when(s("hot")).then(is(s("wet")).and(s("irrational")).e()).e();

        when(isNot(s("raining")).andNot(s("hot")).e()).then(is(s("unknown")).and(s("creepy")).e()).e();

        is(s("hot")).andNot(s("raining")).e();

        isNot(is(s("wet")).or(s("hot")).e()).e();

        is(is(s("wet")).and(s("cool")).e()).e();

        isNot(is(s("cool")).and(s("hot")).e()).e();
    }

    @Test
    public void strings() {
        System.out.println(is(s("raining")).and(s("cool")).e());
        System.out.println(when(isNot(s("raining")).andNot(s("hot")).e()).then(is(s("unknown")).and(s("creepy")).e()).e());
    }

}