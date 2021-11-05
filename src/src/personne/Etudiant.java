package personne;

import Ecole.Groupe;

public class Etudiant extends Personne{
    private int matricule;
    private Groupe group;

    public String toString() {
        return "Etudiant" + this + "(#" + matricule + ")" + " - " + group;
    }
}
