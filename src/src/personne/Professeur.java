package personne;

public class Professeur {
    private String abreviation;

    public String abreviation() {
        return abreviation;
    }

    public String toString() {
        return "Prof." + this + "(" + abreviation + ")";
    }
}
