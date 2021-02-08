import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Level l100 = Level.L100;
        Student s1=new Student("Student eq", l100);
        s1.setGrade(56.9);
        s1.setGrade(45.09);
        s1.setGrade(82.34);
        s1.setGrade(67.23);
        s1.setGrade(76.00);

        // 3rd student to test compare
        Student s3=new Student("Student eq", l100);
        s3.setGrade(56.9);
        s3.setGrade(45.09);
        s3.setGrade(82.34);
        s3.setGrade(67.23);
        s3.setGrade(70.00);

        System.out.println(s1);
        System.out.println(s1.getAverageGrade());

        Student s2= new Student("Student 2", Level.L200);
        s2.setGrade(70.00);
        s2.setGrade(87.6);
        s2.setGrade(85.00);


        // naughty student test
        Student ns= new NaughtyStudent("Naughty stud", Level.L400);
        ns.setGrade(70.00);
        ns.setGrade(87.6);
        ns.setGrade(85.00);


        System.out.println(s2);
        System.out.println(s2.getAverageGrade());

        //test ns average
        System.out.println(ns.getAverageGrade());

        Lecture l1 = new Lecture();
        l1.enter(s1);
        l1.enter(s2);
        // ading naughty stud to lecuture
        l1.enter(ns);

        // test register's print report
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(ns);
        Register newRegister = new Register(studentList);
        // testing
        String report = newRegister.printReport();
        System.out.println(report);

        List<Student> sortedStudent = newRegister.sort();

        for(Student s : sortedStudent) {
            System.out.println(s);
        }

        // implementing bags
        BagOfLectures lectureBag = new BagOfLectures();
        lectureBag.add(l1);

        BagOfStudents studentBag = new BagOfStudents();
        studentBag.add(s1);
        studentBag.add(ns);

        Bag<Register> registerBag = new Bag<Register>();
        registerBag.add(newRegister);

        Bag<Student> studentBag1 = new Bag<>();
        studentBag1.add(s1);

        Bag<Lecture> lectureBag1 = new Bag<>();

        System.out.println("The highest average is: " + l1.getHighestAverage());
    }

}
