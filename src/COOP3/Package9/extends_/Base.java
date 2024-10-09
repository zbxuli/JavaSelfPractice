package COOP3.Package9.extends_;

public class Base {
    public int n1 = 1;
    protected  int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public int getN4() {
        return n4;
    }

    /*public Base(){
        System.out.println("base()");
    }*/

    public Base( String name){
        System.out.println(name + " base()");
    }
    public void test1(){
        System.out.println("test1");
    }

    protected void test2(){
        System.out.println("test2");
    }
     void test3(){
         System.out.println("test3");
     }

     private void test4(){
         System.out.println("test4");
     }

     public  void call(){
        test4();
     }
}
