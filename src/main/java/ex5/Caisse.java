package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Caisse.
 */
public class Caisse {

	private String nom;
	private List<Item> items;
	private Integer poidsMax;
	private Integer poidsMin;

	/**
	 * Constructeur
	 *
	 * @param nom      the nom
	 * @param poidsMax the poids max
	 * @param poidsMin the poids min
	 */
	public Caisse(String nom, Integer poidsMax, Integer poidsMin) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidsMax = poidsMax;
		this.poidsMin = poidsMin;
	}

	/**
	 * Gets poids max.
	 *
	 * @return the poids max
	 */
	public Integer getPoidsMax() {
		return poidsMax;
	}

	/**
	 * Sets poids max.
	 *
	 * @param poidsMax the poids max
	 */
	public void setPoidsMax(Integer poidsMax) {
		this.poidsMax = poidsMax;
	}

	/**
	 * Gets poids min.
	 *
	 * @return the poids min
	 */
	public Integer getPoidsMin() {
		return poidsMin;
	}

	/**
	 * Sets poids min.
	 *
	 * @param poidsMin the poids min
	 */
	public void setPoidsMin(Integer poidsMin) {
		this.poidsMin = poidsMin;
	}

	/**
	 * Getter pour l'attribut nom
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut items
	 *
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * Setter pour l'attribut items
	 *
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * Add item.
	 *
	 * @param item the item
	 */
	public void addItem(Item item) {
		items.add(item);
	}
}
