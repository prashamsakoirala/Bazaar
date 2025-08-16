package common;

import java.util.ArrayList;
import java.util.List;

/**
 * The PebbleBag class provides a container space for the Pebble class.
 * This class supports adding a pebble, removing a pebble, getting pebble count for color, and getting the total pebble count.
 */


public class PebbleBag {

    private ArrayList<Pebble> pebbleBag;

    /**
     * Creates a new empty {@code PebbleBag}
     */
    public PebbleBag(){
        this.pebbleBag = new ArrayList<>();
    }

    /**
     * Creates a new {@code PebbleBag} from an existing ArrayList of pebbles
     * @param arrayOfPebbles ArrayList of pebbles
     */
    public PebbleBag(ArrayList<Pebble> arrayOfPebbles){
        this.pebbleBag = arrayOfPebbles;
    }

    /**
     * Creates a new {@code PebbleBag} from the given pebbles
     * @param pebbles the pebbles to include in the bag
     */

    public PebbleBag(Pebble... pebbles) {
        this.pebbleBag = new ArrayList<>(List.of(pebbles));
    }

    /**
     * Adds a pebble to the pebbleBag
     *
     * @param pebble the pebble color
     */
    public void add(Pebble pebble){
        this.pebbleBag.add(pebble);
    }


    /**
     * Removes a pebble from the pebbleBag
     *
     * @param pebble the pebble color
     * @return boolean on success/failure
     */

    public boolean remove(Pebble pebble){
        return this.pebbleBag.remove(pebble);
    }

    /**
     * Gets size of pebbleBag
     *
     * @return size of pebbleBag
     */

    public int getSize(){
        return pebbleBag.size();
    }


    /**
     * Gets count of a pebble color within the bag
     * @param pebble the pebble color
     * @return the number of pebbles that has that color in the bag
     */

    public int getPebbleCount(Pebble pebble){
        int count = 0;
        for (int i = 0; i<getSize(); i++){
            if (pebbleBag.get(i) == pebble){
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if this pebbleBag is a subset of another pebbleBag
     * @param other the superset pebbleBag
     * @return boolean on whether this pebbleBag is a subset of other
     */

    public boolean isSubset(PebbleBag other){
        for (Pebble pebble : Pebble.values()){
            if (this.getPebbleCount(pebble) > other.getPebbleCount(pebble)){
                return false;
            }
        }
        return true;
    }


}
