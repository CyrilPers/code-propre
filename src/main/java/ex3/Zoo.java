package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Zoo.
 */
public class Zoo<T extends Zone> {

    private String nom;
    private List<T> zones = new ArrayList<T>();

    /**
     * Instantiates a new Zoo.
     *
     * @param nom the nom
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.zones.add((T) new SavaneAfricaine());
        this.zones.add((T) new ZoneCarnivore());
        this.zones.add((T) new FermeReptile());
        this.zones.add((T) new Aquarium());
    }

    /**
     * Afficher liste animaux.
     */
    public void afficherListeAnimaux() {
        for (T zone : zones) {
            zone.afficherListeAnimaux();
        }
    }

    public List<T> getZones() {
        return zones;
    }

    public void setZones(List<T> zones) {
        this.zones = zones;
    }

    /**
     * Getter for nom
     *
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
     * @param animal
     */
    public void addAnimal(Animal animal) {
        for (T zone : zones) {
            if (zone.accept(animal)) {
                zone.addAnimal(animal);
                break;
            }
        }
    }

}