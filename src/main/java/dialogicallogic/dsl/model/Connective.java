package dialogicallogic.dsl.model;

public enum Connective {
    AND {
        @Override
        public String toString() {
            return "\u2227";
        }

        public String getJavaCode() {
            return "&&";
        }
    },

    OR {
        @Override
        public String toString() {
            return "\u2228";
        }

        public String getJavaCode() {
            return "||";
        }
    },

    IMPLICATION {
        @Override
        public String toString() {
            return "\u21d2";
        }
    };

    public String getText() {
        return toString();
    }

}
