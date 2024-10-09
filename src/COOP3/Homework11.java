package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Homework11 {
    //调用method方法，代码如下，编译正确，试写出method方法的定义形式
    //调用语句为sout(method(method(10.0,20.0),100));
    public static void main(String[] args) {
        System.out.println(method(method(10.0,20.0),100));
    }
    public static double method(double a, double b){

        if(a> b){
            return a;
        }else{
            return b;
        }
    }
    public static double method(double a,int b){
        if(a> b){
            return a;
        }else{
            return b;
        }
    }
}
