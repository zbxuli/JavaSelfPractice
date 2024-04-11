package static_;

public class Block {
    public static void main(String[] args) {
        //3.Using static variables only calls static code blocks
        System.out.println(Test.n);
        //A static code block, also known as a static code block,
        // is used to initialize a class and is executed only once as the class is loaded.
        // If it is a regular code block, it is executed every time an object is created.
        Test test = new Test();
        System.out.println("~~~~~~~~~");
        Test test1 = new Test();

        //1.When creating an object instance,call code blocks
        //2.Create subclass object instances, and the parent class will also be loaded
        //2.Prioritize calling static code blocks, followed by regular code blocks
        System.out.println("+++++++++++");
        Daughter daughter = new Daughter();

        //the order of the sequence
        System.out.println("~~~~~~~~sequence~~~~~~~~");
        Sequence sequence = new Sequence();


    }

}
class Sequence{
    private static int a=getA();
    private int b=getB();
    {
        System.out.println("sequence ordinary ");
    }
    static {
        System.out.println("sequence static");
    }

    //pay attention to this coding style
    public static int getA(){
        System.out.println("Sequence getA ");
        return 100;

    }
    public  int getB(){
        System.out.println("sequence getB");
        return 200;
    }

    public Sequence() {
        System.out.println("sequence constructor");
    }
}
class Test{
    public static int n=99;
    {
        System.out.println("test");
    }
    static {
        System.out.println("staticTest");
    }
}
class Mother{
    {
        System.out.println("mother");
    }
    static {
        System.out.println("static mother");
    }
}
class Daughter extends  Mother{
    {
        System.out.println("daughter");
    }
    static {
        System.out.println("static daughter");
    }
}