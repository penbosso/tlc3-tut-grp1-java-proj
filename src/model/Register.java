package model;

import java.util.*;
import java.util.stream.Collectors;

import Exception.StudentNotFoundException;

public class Register {
    List<Student> studentList = new ArrayList<>();

    public Register(List<Student> students){
        studentList.addAll(students);
    }

    public List<String> getRegister(){
        return this.studentList.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level studentLevel) {
        return this.studentList.stream()
                .filter(student -> student.getLevel()==studentLevel)
                .collect(Collectors.groupingBy(Student::getLevel));
    }

    //returns a formatted string of all the names of the students grouped by their model.Level
    public String printReport() {
        String formatedStudentNamesbyLevel = "";
        String Level100 = "model.Level 100: \n";
        String Level200 = "model.Level 200: \n";
        String Level300 = "model.Level 300: \n";
        String Level400 = "model.Level 400: \n";

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

    public List<Student> sort() {
       return this.studentList.stream()
               .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAverageGrade))
               .collect(Collectors.toList());
    }

    public Student getStudentByName(String name) throws StudentNotFoundException {

        if(this.getRegister().contains(name)){

            for (Student s: this.studentList) {
                if(s.getName().equals(name)){
                    return  s;
                }
            }
            return null;
        }else{
            System.out.println("No such student is found in the register");
            throw new StudentNotFoundException();
        }
    }
}
