import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Nameable> studentNames = new ArrayList<>();

    public Register(List<Nameable> students){
        studentNames.addAll(students);
    }

    public List<String> getRegister(){
        List <String> names = new ArrayList<>();
        for (Nameable student: studentNames) {
            names.add(student.getName());
        }
        return names;
    }
}
