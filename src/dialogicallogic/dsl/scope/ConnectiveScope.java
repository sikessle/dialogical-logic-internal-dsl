package dialogicallogic.dsl.scope;

public interface ConnectiveScope extends EndScope {
    MolecularScope and(String term);
    MolecularScope or(String term);
    MolecularScope andNot(String term);
    MolecularScope orNot(String term);

    MolecularScope and(MolecularScope formula);
    MolecularScope or(MolecularScope formula);
    MolecularScope andNot(MolecularScope formula);
    MolecularScope orNot(MolecularScope formula);
}
