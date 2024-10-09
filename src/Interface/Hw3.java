package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw3 {
  public static void main(String[] args) {
    Animal cat = new Cat();
    Animal dog = new Dog();
    dog.shout();
    cat.shout();
  }
}
abstract class Animal{
  //抽象类格式要记住
  public abstract void shout();
}
class Cat extends  Animal{
  @Override
  public void shout() {
    System.out.println("cat meow");
  }
}
class Dog extends Animal{
  @Override
  public void shout() {
    System.out.println("Dog wof");
  }
}