package ex3;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Savane africaine.
 */
public class SavaneAfricaine {

	private List<Mammifere> mammiferes = new ArrayList<>();

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
	 * Compter animaux int.
	 *
	 * @return the int
	 */
	public int compterAnimaux(){
		return mammiferes.size();
	}

	/**
	 * Calculer kgs nourriture par jour int.
	 *
	 * @return the int
	 */
	public int calculerKgsNourritureParJour(){
		return mammiferes.size() * 10;
	}
}