package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import Exception.StudentNotFoundException;
import model.*;


public class RegisterTest {

    @Test(expected = StudentNotFoundException.class)
    public void testStudentNotFoundException() throws StudentNotFoundException {
        Student s1 = new Student("Maggie", Level.L100);
        Student s2 = new Student("Benjie", Level.L200);
        Student s3 = new Student("Christian", Level.L300);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Register newRegister = new Register(studentList);
        newRegister.getStudentByName("Man");
    }

}
