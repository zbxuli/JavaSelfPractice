package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Homework13 {
  public static void main(String[] args) {
    PassObject p =new PassObject();
    Circl c = new Circl();

    p.printAreas(c,3);
  }
}

//将对象作为参数传递给方法
//1.定义一个circle类，包含一个double型的radius属性代表⚪的半径，findArea()方法返回圆的面积
class Circl{
  double radius;


  public double findArea(){
    return Math.PI * radius * radius;
  }



  public double setRadius(double radius) {
    this.radius = radius;
    return radius;
  }
}
//2.定义一个类passObject,在类中定义一个方法printAreas（），该方法定义如下：
//public void printAreas（Circle c, int times）
//3.在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如，times为5
//则输出半径1，2，3，4，5以及对应的圆面积
class PassObject{
  public void printAreas(Circl c, int times){
    for (int i = 1; i <=times; i++) {
      double r= c.setRadius(i);
      System.out.println(r+"   \t"+ c.findArea());
    }
  }
}
//在main方法中调用printAreas()方法，调用完毕后输出当前半径值