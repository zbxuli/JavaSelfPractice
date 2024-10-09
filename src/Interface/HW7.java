package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class HW7 {
  public static void main(String[] args) {
    Car car = new Car(43);
    Car car1 = new Car(-3);
    Car car2 = new Car(23);
    car.getAir().flow();
    car1.getAir().flow();
    car2.getAir().flow();
  }
}
class Car{
  private double temperature;

  public Car(double temperature) {
    this.temperature = temperature;
  }

    //成员内部类
  class Air{
    public void flow(){
      if(temperature >40){
        System.out.println("blow cold wind");
      } else if (temperature <0) {
        System.out.println("blow warm wind");
      }else {
        System.out.println("turn off air ");
      }
    }
  }
  //提供方法返回内部类

  public Air getAir(){
    return new Air();
  }
}