package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class HW6 {
  public static void main(String[] args) {
    //
    Person tangseng = new Person("tangseng", new Horse());
    tangseng.common();
    tangseng.passRiver();
    tangseng.common();
    tangseng.passRiver();
    tangseng.common();
    tangseng.firehill();
    tangseng.passRiver();
  }
}

class Horse implements Vehicles{
  @Override
  public void work() {
    System.out.println("ride horse");
  }
}
class Boat implements Vehicles{
  @Override
  public void work() {
    System.out.println("take boat");
  }
}

class Airplane implements Vehicles{
  @Override
  public void work() {
    System.out.println("take plane");
  }
}
class Factory{
  //可以直接定义类类型方法
  private static Horse h = new Horse();//饿汉式
  public static Horse getHorse(){
    return h;
  }
  public static Boat getBoat(){
    return new Boat();
  }
  public static Airplane getPlane(){
    return new Airplane();
  }
}
class Person{
  private String name;
  public Vehicles v;

  public Person(String name, Vehicles v) {
    this.name = name;
    this.v = v;
  }

  public void passRiver(){
    //如何防止始终使用的是传入的马 instanceof
    /*v instanceof Boat判断当前v是否为boat
    v = null 结果false
    v= horse 结果false
    v = boat j结果true

     */
    if(!(v instanceof Boat)){
      v = Factory.getBoat();
    }

    v .work();

  }
  public void common(){
    if(!(v instanceof Horse)){
      v = Factory.getHorse();
    }

    v .work();
  }
  public void firehill(){
    if(!(v instanceof Airplane)){
      v = Factory.getPlane();
    }

    v .work();
  }
}