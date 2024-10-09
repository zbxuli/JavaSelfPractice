package EbGeneric15;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw2 {
  public static void main(String[] args) {
    //1.T,E 只能放引用类型，不能放基本类型
    //List<int> list2 = new ArrayList<int>();

    //2.在给泛型指定具体类型之后，可以传入该类型或者其子类类型
    University<A> a = new University<A>(new A());
    a.f();
    University<A> b = new University<A>(new B());
    b.f();
  }
}
class A{
}
class B extends  A{}
class University<E>{
  E e;

  public University(E e) {
    this.e = e;
  }
  public void f(){
    System.out.println(e.getClass());
  }
}
