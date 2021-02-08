package model;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    // creating a list for student

    List<Student> student= new ArrayList<>();

 //creating the enter function
    public void enter(Student s1) {
     this.student.add(s1);

 }

    @Override
    public String toString() {
        return "model.Lecture{" +
                "student=" + student +
                '}';
    }

    public double getHighestAverage(){
     double highestAverageMark= 0.0;
     for(int i=0; i< student.size(); i++){
         if(highestAverageMark < student.get(i).getAverageGrade()){
            highestAverageMark = student.get(i).getAverageGrade() ;
         }

     }
     return highestAverageMark;
    }
}
