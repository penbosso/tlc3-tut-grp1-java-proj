import java.util.*;
public class Student implements Nameable {
    private String name;
    //creating a list for the student grades
    List<Double> grades = new ArrayList<>();

    Student( String name) {
        this.name = name;
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
}
