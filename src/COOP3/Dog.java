package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Dog {
  //设计一个Dog类，有名字，颜色和年龄属性，定义输出方法show（）显示其信息，并创建对象，进行测试
  String name;
  String color;
  int age;

  public Dog(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public void show(){
    System.out.println( "the dog name is :"+ name
            +", the color is :"+ color+
            ", the age is :"+ age);
  }
  public static void main(String[] args) {
    Dog d =new Dog("Lily", "brown",3);
    d.show();
  }
}
