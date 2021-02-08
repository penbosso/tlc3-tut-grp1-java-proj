package test;

import model.Lecture;
import model.Level;
import model.Student;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LectureTest {

    @Test
    public void getHighestAverageGrade(){
        Student student1 = new Student("Student1", Level.L100);
        student1.setGrade(45.50);
        student1.setGrade(75.50);
        student1.setGrade(95.50);

        Student student2 = new Student("Student2", Level.L100);
        student2.setGrade(25.50);
        student2.setGrade(65.50);
        student2.setGrade(75.50);

        Student student3 = new Student("Student3", Level.L100);
        student3.setGrade(58.50);
        student3.setGrade(99.50);
        student3.setGrade(46.50);

        Lecture lecture1 = new Lecture();
        lecture1.enter(student1);
        lecture1.enter(student2);
        lecture1.enter(student3);

        double expectedHighestAverageGrade = student1.getAverageGrade();
        double actualHighestAverageGrade = lecture1.getHighestAverage();

        assertEquals(expectedHighestAverageGrade, actualHighestAverageGrade);

    }
}
