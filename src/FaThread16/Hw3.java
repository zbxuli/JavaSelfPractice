package FaThread16;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 两个用户分别从同一个卡上取钱
 * 每次取1000，当余额不足时，就不取了
 * 不能出现超取现象 线程同步问题
 *
 */
public class Hw3 {
  public static void main(String[] args) {
    C c = new C();
    Thread thread = new Thread(c);
    thread.setName("t1");
    Thread thread1 = new Thread(c);
    thread1.setName("t2");
    thread.start();
    thread1.start();

  }
}
class C implements Runnable{
  private double money =10000;

    public double getMoney;

  @Override
  public void run() {
    while (true) {


     synchronized (this){
       if(money<1000){
         System.out.println("money not enough");
         break;
       }
       money-= 1000;
       System.out.println(Thread.currentThread().getName()+ "get 1000");

       try {
         Thread.sleep(100);
       } catch (InterruptedException e) {
         throw new RuntimeException(e);
       }
     }
    }
  }
}

