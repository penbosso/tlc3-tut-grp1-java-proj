package model;

import java.util.HashMap;
import java.util.Map;

public class BagOfLectures {

    private Map<Lecture, Integer> items = new HashMap<Lecture,Integer>();

    // add an lecture
    public void  add (Lecture lecture) {
        if (items.containsKey(lecture)) {
            items.put(lecture, items.get(lecture) + 1);
        } else {
            items.put(lecture, 1);
        }
    }
    // Remove an lecture
    public void remove (Lecture lecture) {
        if(items.containsKey(lecture)) {
            int count = items.get(lecture);
            if(count == 1) {
                items.remove(lecture);
            } else {
                items.put(lecture, count -1);
            }
        }
    }

    // Clear bag
    public void clear () {
        items.clear();
    }
}
