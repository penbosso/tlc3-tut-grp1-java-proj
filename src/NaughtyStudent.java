public class NaughtyStudent extends Student {
//    public NaughtyStudent(String name){
//        super(name);
//    }
    public double getAverageGrade(){
        return super.getAverageGrade()*1.10;
    }
}
