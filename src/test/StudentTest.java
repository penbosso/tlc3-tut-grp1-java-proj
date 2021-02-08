package test;

import model.Level;
import model.NaughtyStudent;
import model.Student;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class StudentTest {

    @Test
    public void getAverageGrade(){
        Random rand = new Random();
        double firstGrade = rand.nextInt(101);
        double secondGrade = rand.nextInt(101);
        double thirdGrade = rand.nextInt(101);
        double expectedAverageGrade = (firstGrade+secondGrade+thirdGrade)/3;

        Student normalStudent = new Student("normalStudent", Level.L100);
        normalStudent.setGrade(firstGrade);
        normalStudent.setGrade(secondGrade);
        normalStudent.setGrade(thirdGrade);

        double actualAverageGrade = normalStudent.getAverageGrade();

        assertEquals(expectedAverageGrade, actualAverageGrade);

    }

    @Test
    public void naughtyStudentScoresHighMarks(){
        Random rand = new Random();
        double firstGrade = rand.nextInt(101);
        double secondGrade = rand.nextInt(101);
        double thirdGrade = rand.nextInt(101);
        Student normalStudent = new Student("normalStudent", Level.L100);
        normalStudent.setGrade(firstGrade);
        normalStudent.setGrade(secondGrade);
        normalStudent.setGrade(thirdGrade);

        double normalStudentAverageGrade = normalStudent.getAverageGrade();

        Student naughtyStudent = new NaughtyStudent("naughtyStudent", Level.L100);
        naughtyStudent.setGrade(firstGrade);
        naughtyStudent.setGrade(secondGrade);
        naughtyStudent.setGrade(thirdGrade);
        double naughtyStudentAverageGrade = naughtyStudent.getAverageGrade();

        assertEquals(naughtyStudentAverageGrade, normalStudentAverageGrade*1.10);

    }

}
