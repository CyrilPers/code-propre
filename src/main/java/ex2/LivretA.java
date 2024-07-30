package ex2;

/**
 * Compte bancaire Livret A
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Instancier nouveau Livret A.
	 *
	 * @param solde the solde
	 */
	public LivretA(double solde) {
		super(solde);
	}

	/**
	 * Gets taux remuneration.
	 *
	 * @return the taux remuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 *
	 * @param tauxRemuneration  tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	/** Getter for type
	 * @return the type
	 */

	/**
	 * Débiter le livret A d'un montant
	 * @param montant à débiter
	 */
	public void debiterMontant(double montant){
			if (this.getSolde() - montant > 0){
				this.setSolde(this.getSolde() - montant);
			}
	}

	/**
	 * Appliquer remunération annuelle.
	 */
	public void appliquerRemuAnnuelle(){
			this.setSolde(this.getSolde() + this.getSolde() * tauxRemuneration / 100 );
	}

}
