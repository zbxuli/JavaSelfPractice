package static_;

public class MainTest {
    public static void main(String[] args) {
        //In the main() method, we can directly call the static method
        // or static property of the class where the main() method is located
        //However, non-static members in the class cannot be directly accessed.
        // An instance object must be created before non-static members in the class can be accessed through this object.
        System.out.println(n1);
        //System.out.println(n2); directly use will get error
        staticTest();
        //ordinary(); directly use will get error
        MainTest test = new MainTest();
        System.out.println(test.n2);
        test.ordinary();
    }
    public static int n1=100;
    public int n2=200;
    public static void staticTest(){
        System.out.println("staticTest()");
    }
    public void ordinary(){
        System.out.println("ordinary()");
    }


}
