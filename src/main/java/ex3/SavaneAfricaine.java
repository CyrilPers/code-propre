package ex3;

/**
 * The type Savane africaine.
 */
public class SavaneAfricaine extends Zone<Mammifere> {

	/**
	 * Calculer kgs nourriture par jour int.
	 *
	 * @return the int
	 */
	@Override
	public double calculerKgsNourritureParJour(){
		return this.getAnimals().size() * 10;
	}

	@Override
	public boolean accept(Animal animal) {
		return animal instanceof Mammifere && animal.getComportement().equals(Comportement.HERBIVORE);
	}
}