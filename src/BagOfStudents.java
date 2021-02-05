import java.util.HashMap;
import java.util.Map;

public class BagOfStudents {

    private Map<Student, Integer> items = new HashMap<Student,Integer>();

    // add an student
    public void  add (Student student) {
        if (items.containsKey(student)) {
            items.put(student, items.get(student) + 1);
        } else {
            items.put(student, 1);
        }
    }
    // Remove an student
    public void remove (Student student) {
        if(items.containsKey(student)) {
            int count = items.get(student);
            if(count == 1) {
                items.remove(student);
            } else {
                items.put(student, count -1);
            }
        }
    }

    // Clear bag
    public void clear () {
        items.clear();
    }
}
