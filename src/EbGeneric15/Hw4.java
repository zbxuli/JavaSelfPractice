package EbGeneric15;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw4 {
  public static void main(String[] args) {
    Apple<String,Integer,Double> apple = new Apple<String,Integer,Double>();
    apple.fly(10);//自动装箱
    apple.fly(new Dogg());
  }
}
class Apple<T,R,M>{
  public<E> void fly(E e){
    System.out.println(e.getClass().getSimpleName());
  }
  //public void eat(U u){} 整个类没有U这个类型，所以错
  public void run(M m){}
}
class Dogg{}