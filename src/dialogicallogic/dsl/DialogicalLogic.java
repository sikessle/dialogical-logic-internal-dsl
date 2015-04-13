package dialogicallogic.dsl;

import dialogicallogic.dsl.scope.*;

/**
 * Contains the starting methods
 */
public final class DialogicalLogic {

    private DialogicalLogic() {
        throw new AssertionError("static class");
    }

    public static AtomicScope is(String term) {
        return null;
    }

    public static AtomicScope is(MolecularScope formula) {
        return null;
    }

    public static AtomicScope isNot(String term) {
        return null;
    }

    public static AtomicScope isNot(MolecularScope formula) {
        return null;
    }

    public static ImplicationScope when(String term) {
        return null;
    }

    public static ImplicationScope whenNot(String term) {
        return null;
    }

    public static ImplicationScope when(MolecularScope formula) {
        return null;
    }

    public static ImplicationScope whenNot(MolecularScope formula) {
        return null;
    }
}
