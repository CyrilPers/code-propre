package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Zone.
 *
 */
public abstract class Zone {
    private List<Animal> animals = new ArrayList<>();
    private String nom;
    /**
     * Gets animals.
     *
     * @return the animals
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Sets animals.
     *
     * @param animals the animals
     */
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * Add animal.
     *
     * @param animal the animal
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Afficher liste animaux.
     */
    public void afficherListeAnimaux(){
        for (Animal animal: animals){
            System.out.println(animal.getNom());
        }
    }

    /**
     * Calculer kgs nourriture par jour double.
     *
     * @return the double
     */
    public double calculerKgsNourritureParJour(){
        return animals.size();
    }

    public boolean accept(Animal animal) {
        return false;
    }
}
