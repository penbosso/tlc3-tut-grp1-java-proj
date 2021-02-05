import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Student> studentList = new ArrayList<>();

    public Register(List<Student> students){
        studentList.addAll(students);
    }

    public List<String> getRegister(){
        List <String> names = new ArrayList<>();
        for (Nameable student: studentList) {
            names.add(student.getName());
        }
        return names;
    }

    public List<String> getRegisterByLevel(Level studentLevel) {
        List <String> namesOfStudentAtLevel = new ArrayList<>();
        for (Student student: studentList) {
            if(student.getLevel() == studentLevel) {
                namesOfStudentAtLevel.add(student.getName());
            }
        }
        return namesOfStudentAtLevel;
    }

    //returns a formatted string of all the names of the students grouped by their Level
    public String printReport() {
        String formatedStudentNamesbyLevel = "";
        String Level100 = "Level 100: \n";
        String Level200 = "Level 200: \n";
        String Level300 = "Level 300: \n";
        String Level400 = "Level 400: \n";

        for (Student student: studentList) {
            if(student.getLevel() == Level.L100) {
                Level100 += "-> " + student.getName() + "\n";
            } else if(student.getLevel() == Level.L200) {
                Level200 += "-> " + student.getName() + "\n";
            } else if(student.getLevel() == Level.L300) {
                Level300 += "-> " + student.getName() + "\n";
            } else if(student.getLevel() == Level.L400) {
                Level400 += "-> " + student.getName() + "\n";
            }
        }
            formatedStudentNamesbyLevel = Level100 + Level200 + Level300 + Level400;

        return formatedStudentNamesbyLevel;
    }
}
