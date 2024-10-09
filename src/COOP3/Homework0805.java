package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 设计父类 员工类 子类 工人类 worker 农民类 Peasants 教师类 Teacher
 * 科学家类 Scientist 服务生类Waiter
 * 其中工人，农民，服务生类只有基本工资 sal
 * 教师除基本工资外，还有课酬 （元/天）
 * 科学家除了基本工资外，还有年终奖
 * 编写一个测试类，将各种类型的员工全年工资打印出来
 */
public class Homework0805 {
}
class Emp{
  private String name;
  private String type;
  private String basicSal;

  public Emp(String name, String type, String basicSal) {
    this.name = name;
    this.type = type;
    this.basicSal = basicSal;
  }
}
class Teac extends Emp{

  public Teac(String name, String type, String basicSal) {
    super(name, type, basicSal);
  }
  private double classSal;
}