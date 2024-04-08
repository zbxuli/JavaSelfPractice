package extends_;

public class B extends A{
    private int n1 = 7;
    public void hi(){
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
    }

    public void calculate(){
        System.out.println("B's calculate");
    }
    public  void sum(){
        System.out.println("B's sum()");
        //to find calculate():
        /*
           1.check within the same class; if it exists, then call it
           2.If find nothing, check within the father class(if it exists, and can be called, call it)
           3.If father class does not have, find father's father class
           hint: if find the method, can not visit, the machine will give error
                 if can not find the method, the machine will give the info
         */
        calculate();
        this.calculate();// equal to calculate
        super.calculate();
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void hello(){
        super.test1();
        super.test2();
        super.test3();
    }
}
