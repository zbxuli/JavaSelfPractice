package EbGeneric15;

import java.util.ArrayList;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Generic {
  public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    dogs.add(new Dog("cool", 2));
    dogs.add(new Dog("good", 3));
    dogs.add(new Dog("goose", 4));
    for (Dog dog :dogs) {
      System.out.println(dog.getName() +" "+dog.getAge());
    }


  }
}
class Dog{
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
class Cat{
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
