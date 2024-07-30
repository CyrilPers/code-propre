package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Aquarium.
 */
public class Aquarium {

	private List<Poisson> poissons = new ArrayList<Poisson>();

	/**
	 * Add animal.
	 *
	 * @param poisson the poisson
	 */
	public void addAnimal(Poisson poisson) {
		poissons.add(poisson);
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux(){
		for (Poisson poisson: poissons){
			System.out.println(poisson.getNom());
		}
	}

	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	public double calculerKgsNourritureParJour(){
		return poissons.size() * 0.2;
	}
}