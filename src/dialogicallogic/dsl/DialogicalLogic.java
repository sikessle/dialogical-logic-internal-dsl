package dialogicallogic.dsl;

import dialogicallogic.dsl.scope.*;

public final class DialogicalLogic {

    private DialogicalLogic() {
        throw new AssertionError("static class");
    }

    public static IsScope is(String term) {
        return null;
    }

    public static IsScope is(FormulaScope formula) {
        return null;
    }

    public static NotScope not(String term) {
        return null;
    }

    public static NotScope not(FormulaScope formula) {
        return null;
    }

    public static WhenScope when(String term) {
        return null;
    }

    public static WhenScope whenNot(String term) {
        return null;
    }
}