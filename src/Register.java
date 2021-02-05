import java.util.*;

public class Register implements Comparator<Student> {
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

    public Map<Level, List<Student>> getRegisterByLevel(Level studentLevel) {
        List <Student> lisOfStudents = new ArrayList<>();
        Map<Level, List<Student>> registerByLevel = new HashMap<>();

        for (Student student: studentList) {
            if(student.getLevel() == studentLevel) {
                lisOfStudents.add(student);
            }
        }
        registerByLevel.put(studentLevel, lisOfStudents);

        return registerByLevel;
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

    @Override
    public int compare(Student s1, Student s2) {
        int nameCompare = s1.getName().compareTo(s2.getName());
        int averageGradeCompare = (int) (s1.getAverageGrade() -s2.getAverageGrade());

        if(nameCompare == 0) {
            return averageGradeCompare;
        } else {
            return nameCompare;
        }
    }

    public List<Student> sort() {
        Collections.sort(this.studentList, new Register(studentList));
        return this.studentList;
    }
}
