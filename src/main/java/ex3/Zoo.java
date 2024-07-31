package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Zoo.
 */
public class Zoo {

    private String nom;
    private List<Zone> zones = new ArrayList<>();

    /**
     * Instantiates a new Zoo.
     *
     * @param nom the nom
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.zones.add(new SavaneAfricaine());
        this.zones.add(new ZoneCarnivore());
        this.zones.add(new FermeReptile());
        this.zones.add(new Aquarium());
    }

    /**
     * Afficher liste animaux.
     */
    public void afficherListeAnimaux() {
        for (Zone zone : zones) {
            zone.afficherListeAnimaux();
        }
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
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
        for (Zone zone : zones) {
            if (zone.accept(animal)) {
                zone.addAnimal(animal);
                break;
            }
        }
    }

}