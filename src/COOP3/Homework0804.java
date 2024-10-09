package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 通过继承实现员工工资核算打印功能
 * 父类：员工类
 * 子类：部门经理类，普通员工类
 * 部门经理工资： 1000+ 单日工资*天数*等级1.2
 * 普通员工工资： 单日工资*天数*等级1.0
 * 员工属性 姓名， 单日工资，工作天数
 * 员工方法 打印工资
 * 普遍员工及部门经理都是员工子类，需要重写打印工资方法
 * 定义并初始化普通员工对象，调用打印工资方法输入工资，
 * 定义并初始化部门经理对象，调用打印工资方法输入工资
 */

public class Homework0804 {
  public static void main(String[] args) {
    Manager li = new Manager("li", 300, 20);
    li.introduce();
  }
}
class Employee0804{
  public String name;
  private double sal;
  private int days;

  public Employee0804(String name, double sal, int days) {
    this.name = name;
    this.sal = sal;
    this.days = days;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSal() {
    return sal;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }
  public void introduce(){
    System.out.println("name " + name + "days :"+days
    + "salary ；"+sal);
  }
}
class Manager extends Employee0804{
    private double sumSal;
  public Manager(String name, double sal, int days) {
    super(name, sal, days);
  }
  public void introduce(){
    //1000+ 单日工资*天数*等级1.2
    sumSal = 1000 + getSal()*getDays()*1.2 ;
    super.introduce();
    System.out.println("他的月工资为 ：" + sumSal);
  }
}
