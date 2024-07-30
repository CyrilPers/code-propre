package ex3;
/**
 * The type Aquarium.
 */
public class Aquarium extends Zone<Poisson> {

	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	@Override
	public double calculerKgsNourritureParJour(){
		return this.getAnimals().size() * 0.2;
	}

	@Override
	public boolean accept(Animal animal) {
		return animal instanceof Poisson;
	}
}