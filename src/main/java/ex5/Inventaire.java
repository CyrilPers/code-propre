package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Inventaire.
 */
public class Inventaire {

    private static final int MAX_WEIGHT = Integer.MAX_VALUE;

    private List<Caisse> caisses;

    /**
     * Instantiates a new Inventaire.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 5, 0));
        caisses.add(new Caisse("Moyens objets", 20, 5));
        caisses.add(new Caisse("Grands objets", MAX_WEIGHT, 20));
    }

    /**
     * Add item.
     *
     * @param item the item
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (item.getPoids() < caisse.getPoidsMax() && item.getPoids() > caisse.getPoidsMin()) {
                caisse.addItem(item);
                break;
            }
        }
    }

    /**
     * Taille int.
     *
     * @return the int
     */
    public int taille() {
        Integer size = 0;
        for (Caisse caisse : caisses) {
            size += caisse.getItems().size();
        }
        return size;
    }
}
