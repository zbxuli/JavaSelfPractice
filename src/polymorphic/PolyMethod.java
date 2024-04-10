package polymorphic;

import extends_.A;

public class PolyMethod {
    public static void main(String[] args) {
        // overload shows polymorphic
        son son = new son();
        // input different data type,the system will automatic use different method
        System.out.println(son.sum(1,2));
        System.out.println(son.sum(1.1,2.2));
        //override shows polymorphic
        father father = new father();
        father.say();
        son.say();

    }

}
class father{
    public void say(){
        System.out.println("father");
    }
}
class son extends father{
    public void say(){
        System.out.println("son");
    }

    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public double sum(double n1, double n2){
        return n1 + n2;
    }

}