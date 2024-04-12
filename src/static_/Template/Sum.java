package static_.Template;

public class Sum extends Template{
    public int job(){
        int sum = 0;
        for (int i = 1; i < 80000000; i++) {
            sum += i;

        }
        System.out.println("Sum mission");
        return sum;
    }
}
