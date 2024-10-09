package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
//要求有属性“name,age,post职称，salary”
  //编写业务方法，introduce(),实现输出一个教师的信息
  //编写教师类的三个子类，Professor，副教授，讲师；工资级别：1.3，1.2，1.1
  //在三个子类里面都重写父类的introduce（）
  //定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
public class Homework0803 {
  public static void main(String[] args) {
    Professor li = new Professor("li", 32,"pro",13200);
    li.introduce();
  }
}
class Teacher{
  public String name;
  public int age;
  public String post;
  public double salary ;

  public Teacher(String name, int age) {
    this.name = name;
    this.age = age;

  }

  public void introduce(){
    System.out.println("name :"+ name + ", age: " +
            age+ ", post: "+ post + ", salary :"+salary);
  }
}
class Professor extends Teacher{

  public Professor(String name, int age, String post, double salary) {
    super(name, age);
    this.post = "professor";
    this.salary = 13000;

  }
  public void introduce(){
    System.out.println("他是教授");
    super.introduce();
  }
}
class Bi_professor extends Teacher{

  public Bi_professor(String name, int age, String post, double salary) {
    super(name, age);
    this.post = "Bi_professor";
    this.salary = 12000;
  }
  public void introduce(){
    System.out.println("name :"+ name + ", age: " +
            age+ ", post: "+ post + ", salary :"+salary);
  }
}

class Tutor extends Teacher{

  public Tutor(String name, int age, String post, double salary) {
    super(name, age);
    this.post = "Tutor";
    this.salary = 11000;
  }
  public void introduce(){
    System.out.println("name :"+ name + ", age: " +
            age+ ", post: "+ post + ", salary :"+salary);
  }
}