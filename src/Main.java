public class Main {
    public static void main(String[]args){
        Student s1=new Student("Student 1");
        s1.setGrade(56.9);
        s1.setGrade(45.09);
        s1.setGrade(82.34);
        s1.setGrade(67.23);
        s1.setGrade(76.00);

        System.out.println(s1);
        System.out.println(s1.getAverageGrade());

        Student s2= new Student("Student 2");
        s2.setGrade(70.00);
        s2.setGrade(87.6);
        s2.setGrade(85.00);


        // naughty student test
        Student ns= new NaughtyStudent("Naughty stud");
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

        System.out.println("The highest average is: " + l1.getHighestAverage());
    }

}
