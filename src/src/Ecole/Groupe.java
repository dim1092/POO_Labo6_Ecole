package Ecole;

import personne.Etudiant;

public class Groupe {
    private int numero, trimestre;
    private String orientaiton;
    Etudiant[] etudiants;
    Lecon[] lecons;

    public String toString() {
        return orientaiton + numero + "-" + trimestre;
    }

    public int nombreEtudiants() {
        return etudiants.length;
    }

    public void definirLecons(Lecon[] lecons) {
        this.lecons = new Lecon[lecons.length];
        System.arraycopy(lecons, 0, this.lecons, 0, lecons.length);
    }
}
