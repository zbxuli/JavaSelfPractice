package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 * person 类，里面有方法 run、eat,Student 类继承person类，
 * 并重写了run方法，定义了study方法，试写出对象向上转型和向下转型代码
 * 并写出各自都可以调用哪些方法，并写出方法输出什么
 */
public class Homework0811 {
  public static void main(String[] args) {
    //向上转型 父类的引用指向子类对象
    Person11 p = new Student();
    p.run();
    p.eat();
    //向下转型 把指向子类对象的父类引用，转成指向子类对象的子类引用
    Student s = (Student) p;
    s.run();
    s.study();
    s.eat();
  }

}
class Person11{
  public void run(){
    System.out.println("person run");
  }
  public void eat(){
    System.out.println("person eat");
  }

}

class Student extends Person11{
  public void run(){
    System.out.println("student run");
  }
  public void study(){
    System.out.println("student study");
  }
}