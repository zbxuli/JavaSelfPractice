package extends_;

public class Detail extends  Base{
    public Detail(){
        super("base");
        System.out.println("detail()");
    }
    public void say(){
        System.out.println("n1 " + n1 +" n2 " + n2 + " n3 " + n3);
        //1.use father class public method to get private field
        System.out.println("n4 " + getN4());
        test1();
        test2();
        test3();
        // 1. use father class public method to call private method
        call();
    }
}
