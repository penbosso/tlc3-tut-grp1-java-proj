import java.util.HashMap;
import java.util.Map;

public class Bag<E> {
    private Map<E, Integer> items = new HashMap<E,Integer>();

    // add an objects
    public void  add (E e) {
        if (items.containsKey(e)) {
            items.put(e, items.get(e) + 1);
        } else {
            items.put(e, 1);
        }
    }

    // Remove an object
    public void remove (E e) {
        if(items.containsKey(e)) {
            int count = items.get(e);
            if(count == 1) {
                items.remove(e);
            } else {
                items.put(e, count -1);
            }
        }
    }

    // Clear list
    public void clear () {
        items.clear();
    }
}
