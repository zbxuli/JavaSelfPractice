package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
//创建一个cale计算类，在其中定义两个变量表示两个操作数，定义四个方法实现求和，差，乘，
  //商（要求除数为0的话，要提示）并创建两个对象，分别测试
public class Cale {
    double a;
    double b;
    double sum;
    double minus;
    double mul;
    double shang;
    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void setSum(){
        this.sum = a + b;
    }

    public void setMinus() {
        this.minus = a - b;
    }

    public void setMul(){
        mul = a * b;
    }
    public void setShang(){
        if(b !=0){
            shang = a/b;
        }else{
            shang =0;
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Cale c =new Cale(3,0);
        c.setMinus();

        c.setShang();
        System.out.println(c.minus);
        System.out.println(c.mul);
    }
}
