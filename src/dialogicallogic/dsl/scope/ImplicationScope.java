package dialogicallogic.dsl.scope;

public interface ImplicationScope extends Scope {
    MolecularScope then(String term);

    MolecularScope thenNot(String term);

    MolecularScope then(MolecularScope formula);

    MolecularScope thenNot(MolecularScope formula);
}
