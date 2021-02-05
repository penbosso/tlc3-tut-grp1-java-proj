public class NaughtyStudent extends Student {
    public double getAverageGrade(){
        return super.getAverageGrade()*1.10;
    }
}
