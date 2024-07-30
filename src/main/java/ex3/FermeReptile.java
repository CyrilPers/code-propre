package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Ferme reptile.
 */
public class FermeReptile {

	private List<Reptile> reptiles = new ArrayList<Reptile>();

	/**
	 * Add animal.
	 *
	 * @param reptile the reptile
	 */
	public void addAnimal(Reptile reptile) {
		reptiles.add(reptile);
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux(){
		for (Reptile reptile: reptiles){
			System.out.println(reptile.getNom());
		}
	}

	/**
	 * Compter animaux int.
	 *
	 * @return the int
	 */
	public int compterAnimaux(){
		return reptiles.size();
	}

	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	public double calculerKgsNourritureParJour(){
		return reptiles.size() * 0.1;
	}
}