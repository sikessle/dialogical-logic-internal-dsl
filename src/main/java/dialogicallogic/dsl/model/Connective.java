package dialogicallogic.dsl.model;

public enum Connective {
    AND {
        @Override
        public String toString() {
            return "\u2227";
        }
    },

    OR {
        @Override
        public String toString() {
            return "\u2228";
        }
    },

    IMPLICATION {
        @Override
        public String toString() {
            return "\u21d2";
        }
    }
}
