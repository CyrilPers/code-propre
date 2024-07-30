package ex3;

/**
 * The type Animal.
 */
public abstract class Animal {
    private String nom;
    private Comportement comportement;

    /**
     * Instantiates a new Animal.
     *
     * @param nom          the nom
     * @param comportement the comportement
     */
    public Animal(String nom, Comportement comportement) {
        this.nom = nom;
        this.comportement = comportement;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets comportement.
     *
     * @return the comportement
     */
    public Comportement getComportement() {
        return comportement;
    }

    /**
     * Sets comportement.
     *
     * @param comportement the comportement
     */
    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }


}
