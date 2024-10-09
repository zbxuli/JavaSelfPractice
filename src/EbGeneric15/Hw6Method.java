package EbGeneric15;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 1.泛型方法，可以定义在普通类中，也可以定义在泛型类中
 * 2.当泛型方法被调用时，类型会确定
 * 3.public void eat(E e){},修饰符后没有<T,R...>eat
 * 方法不是泛型方法，而是使用了泛型
 */
public class Hw6Method {
  public static void main(String[] args) {
    Car car = new Car();
    //证明2.0
    car.fly(10,"Good");
    Fish<String, Float> fish = new Fish<String, Float>();
    fish.hello(100,200f);
    //float 类型，输入时数字后面必须带f
  }
}

class Car{
  public void run(){}
  //泛型方法
  public<T,R> void fly(T t ,R r){
    System.out.println(t.getClass().getSimpleName());
    System.out.println(r.getClass().getSimpleName());
  }
}
class Fish<T,R>{
    public void run(){}
    public<U,M> void eat(U u, M m){}
  //泛型方法
  public void hi(T t){}
  //不是泛型方法，只是使用了类声明的 泛型

  public<K> void hello(K k, R r){
    System.out.println(k.getClass());
    System.out.println(r.getClass());
  }
  //泛型方法，可以使用类声明的泛型，也可以使用自己声明泛型
}