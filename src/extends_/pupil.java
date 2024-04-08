package extends_;

public class pupil extends Student{
    // if father class has the method below, the son class can not extend the father class
    public void testing(){
        System.out.println("pupil " + name + " is studying the coding");
    }
}
