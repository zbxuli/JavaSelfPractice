package FaThread16;

import java.util.Scanner;

/**
 * @author Zhongbo Li
 * @version 1.0
 *  main 方法中启动两个线程
 *  * 写类的本质还是OOP继承重写那一套
 *  * 第一个线程循环随机打印100以内整数
 *  * 直到第二个线程从键盘读取了Q命令
 */
public class Hw2 {
  public static void main(String[] args) {
    first first = new first();
    second second = new second(first);
    first.start();
    second.start();

  }
}
class first extends Thread{
  private boolean loop = true;

  @Override
  public void run() {
    while(loop){
      System.out.println((int)(Math.random()*100+1));
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void setLoop(boolean loop) {
    this.loop = loop;
  }
}

class second extends Thread{
  private first a;
  private Scanner sc =new Scanner(System.in);

  public second(first a) {
    this.a = a;
  }

  @Override
  public void run() {
    while(true){
      System.out.println("enter Q to end the system");
      char c = sc.next().toUpperCase().charAt(0);
      if(c =='Q'){
        a.setLoop(false);
        System.out.println("system over");
        break;
    }
    }
  }


}