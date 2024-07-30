package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Zone.
 *
 * @param <T> the type parameter
 */
public abstract class Zone<T extends Animal> {
    private List<T> animals = new ArrayList<T>();

    /**
     * Gets animals.
     *
     * @return the animals
     */
    public List<T> getAnimals() {
        return animals;
    }

    /**
     * Sets animals.
     *
     * @param animals the animals
     */
    public void setAnimals(List<T> animals) {
        this.animals = animals;
    }

    /**
     * Add animal.
     *
     * @param animal the animal
     */
    public void addAnimal(T animal) {
        animals.add(animal);
    }

    /**
     * Afficher liste animaux.
     */
    public void afficherListeAnimaux(){
        for (T animal: animals){
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
}
