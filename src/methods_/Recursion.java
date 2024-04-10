package methods_;

public class Recursion {
    public static void main(String[] args) {
        Rec rec = new Rec();
        // test recursion of print
        rec.print(4);
        //test recursion of factorial
        int res = rec.factorial(4);
        System.out.println(res);
    }

}

class Rec{
    public void print(int n){
        if (n>2){
            print(n-1);
        }
        System.out.println("n = "+ n);
    }

    public int factorial(int n){
        if (n == 1){
            return 1;
        }
        else {
            return factorial(n-1) * n;
        }
    }
}
