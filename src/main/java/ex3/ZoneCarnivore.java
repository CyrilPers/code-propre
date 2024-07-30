package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Zone carnivore.
 */
public class ZoneCarnivore {

	private List<Mammifere> mammiferes = new ArrayList<Mammifere>();

	/**
	 * Add animal.
	 *
	 * @param mammifere the mammifere
	 */
	public void addAnimal(Mammifere mammifere) {
		mammiferes.add(mammifere);
	}

	/**
	 * Afficher liste animaux.
	 */
	public void afficherListeAnimaux(){
		for (Mammifere mammifere: mammiferes){
			System.out.println(mammifere.getNom());
		}
	}

	/**
	 * Calculer kgs nourriture par jour double.
	 *
	 * @return the double
	 */
	public double calculerKgsNourritureParJour(){
		return mammiferes.size() * 10;
	}
}