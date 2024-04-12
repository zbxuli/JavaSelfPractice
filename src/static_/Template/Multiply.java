package static_.Template;

public class Multiply extends Template{
    public int job(){
        int mul = 1;
        for (int i = 1; i < 80000000; i++) {
            mul = mul * i;

        }
        System.out.println("Multiply mission");
        return mul;
    }
}
