public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, Level stuentLevel){
        super(name, stuentLevel);
    }
    public double getAverageGrade(){
        return super.getAverageGrade()*1.10;
    }
}
