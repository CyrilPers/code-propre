package ex3;

/**
 * The type Ferme reptile.
 */
public class FermeReptile extends Zone<Reptile> {


	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	@Override
	public double calculerKgsNourritureParJour(){
		return this.getAnimals().size() * 0.1;
	}

	@Override
	public boolean accept(Animal animal) {
		return animal instanceof Reptile;
	}
}