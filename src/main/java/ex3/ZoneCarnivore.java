package ex3;

/**
 * The type Zone carnivore.
 */
public class ZoneCarnivore extends Zone<Mammifere> {
	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	@Override
	public double calculerKgsNourritureParJour(){
		return this.getAnimals().size() * 10;
	}
}