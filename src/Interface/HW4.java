package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class HW4 {
  public static void main(String[] args) {
      Cellphone cellphone = new Cellphone();
      // 1.匿名内部类
      //new Compute() {
      //          @Override
      //          public double work(double n1, double n2) {
      //              return n1*n2;
      //          }
      //      } 同时也是一个对象
      //编译类型是compute，运行类型就是匿名内部类
      cellphone.testWork(new Compute() {
          @Override
          public double work(double n1, double n2) {
              return n1*n2;
          }
      },10,8);
  }
}
interface Compute{
  // 完成计算，自己设计
  //完成什么样的计算，交给匿名内部类完成
  public double work (double n1,double n2);
}
class Cellphone{
    //当调用testwork方法时，直接传入一个实现compute接口的匿名内部类
    //该匿名内部类可以灵活实现
    public  void testWork(Compute com,double n1, double n2){
      double res = com.work(n1,n2);
        System.out.println(res);
    }
}