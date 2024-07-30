package ex2;

/**
 * Compte bancaire courant
 */
public class CompteCourant extends CompteBancaire {
    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    /**
     * Instancier un compte courant.
     *
     * @param solde the solde
     * @param decouvert le découvert autorisé
     */
    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Débiter le livret A d'un montant
     * @param montant à débiter
     */
    public void debiterMontant(double montant){
        if (this.getSolde() - montant > this.getDecouvert()){
            this.setSolde(this.getSolde() - montant);
        }
    }
}
