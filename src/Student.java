import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel {
    private String name;
    private Level studentLevel;
    //creating a list for the student grades
    List<Double> grades = new ArrayList<>();

    Student( String name, Level studentLevel) {
        this.name = name;
        this.studentLevel = studentLevel;
    }

    public void setGrade(Double grade) {
        this.grades.add(grade);

    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }

    public double getAverageGrade() {
        double total = 0.0;
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }
        return total / grades.size();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.studentLevel;
    }
}
