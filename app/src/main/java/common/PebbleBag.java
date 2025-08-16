package common;

import java.util.ArrayList;
import java.util.List;

public class PebbleBag {

    private ArrayList<Pebble> pebbleBag;

    public PebbleBag(){
        this.pebbleBag = new ArrayList<>();
    }

    public PebbleBag(ArrayList<Pebble> pebbleBag){
        this.pebbleBag = pebbleBag;
    }

    public PebbleBag(Pebble... pebbles) {
        this.pebbleBag = new ArrayList<>(List.of(pebbles));
    }

    public void add(Pebble pebble){
        this.pebbleBag.add(pebble);
    }

    public boolean remove(Pebble pebble){
        return this.pebbleBag.remove(pebble);
    }

    public int getSize(){
        return pebbleBag.size();
    }

    public int getPebbleCount(Pebble pebble){
        int count = 0;
        for (int i = 0; i<getSize(); i++){
            if (pebbleBag.get(i) == pebble){
                count++;
            }
        }
        return count;
    }

    public boolean isSubset(PebbleBag other){
        for (Pebble pebble : Pebble.values()){
            if (this.getPebbleCount(pebble) > other.getPebbleCount(pebble)){
                return false;
            }
        }
        return true;
    }


}
