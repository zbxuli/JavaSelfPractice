package FaThread16;

import java.util.Scanner;

/**
 * @author Zhongbo Li
 * @version 1.0
 * main 方法中启动两个线程
 * 写类的本质还是OOP继承重写那一套
 * 第一个线程循环随机打印100以内整数
 * 直到第二个线程从键盘读取了Q命令
 */
public class Hw1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();



    }
}

class A extends Thread{
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()*100+1));
            //1.while 循环
            // 2.打印
            // 3. math.random()
            //4. 将范围取了 再取整
            // 5.调用tread 休眠方法
            //6. try catch 捕获异常
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    private A a;
    private Scanner sc = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("please input order : Q");
            //charAt(0) 如果toUpperCase()返回的是HELLO，那么charAt(0)会返回H。
            char c = sc.next().toUpperCase().charAt(0);
            if(c == 'Q'){
                a.setLoop(false);
                System.out.println("系统结束运行");
                break;//这个必须加，否则没啥变化会一直打印
            }
        }
    }
}