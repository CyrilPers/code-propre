package ex3;

/**
 * The type Zoo.
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;

	/**
	 * Instantiates a new Zoo.
	 *
	 * @param nom the nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * Add animal.
	 *
	 * @param mammifere the mammifere
	 */
	public void addAnimal(Mammifere mammifere) {
		if (mammifere.getComportement().equals(Comportement.HERBIVORE)){
			savaneAfricaine.addAnimal(mammifere);
		}
		else if (mammifere.getComportement().equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimal(mammifere);
		}
	}

	/**
	 * Add animal.
	 *
	 * @param requin the requin
	 */
	public void addAnimal(Poisson requin) {
		aquarium.addAnimal(requin);
	}

	/**
	 * Add animal.
	 *
	 * @param boa the boa
	 */
	public void addAnimal(Reptile boa) {
		fermeReptile.addAnimal(boa);
	}
}