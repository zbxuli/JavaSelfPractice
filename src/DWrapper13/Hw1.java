package DWrapper13;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 八种基本数据类型对应的引用类型-包装类
 * 有了类的特点，就可以调用类中的方法
 *
 * 找到类里面的方法 ctrl+B
 *
 * 装箱： 基本类型->包装类型
 * 拆箱：反之
 */
@SuppressWarnings("ALL")
public class Hw1 {
  public static void main(String[] args) {
   // f2();
    //只要有基本数据类型，判断的就是值是否相同
    Integer t1=127;
    int t2 =127;
    System.out.println(t1 == t2);



  }
  public static void f0(){
    //演示 int<->Integer 的装箱和拆箱
    //手动装箱
    int n= 100;
    Integer in1 = new Integer(n);
    Integer in2 = Integer.valueOf(n);
    //手动拆箱
    int m = in1.intValue();

    //自动装箱 int- Integer
    int n1= 200;
    Integer inte1 = n1; //底层使用Integer.valueOf(n);
    //自动拆箱 Integer - int
    int n2 = inte1; //底层仍使用intValue()方法
  }
  public static void f1(){
    Object obj1 = true? new Integer(1): new Double(2);
    //三元运算符要当作一个整体，会将结果自动改成最高的形式Double输出结构

    Object obj2;
    if(true){
      obj2 =new Integer(1);
    }else {
      obj2 = new Double(2);
    }
    System.out.println(obj1);
    System.out.println(obj2);
  }

  public static void f2(){
    Integer i = new Integer(1);
    Integer j = new Integer(1);
    System.out.println(i == j);
    //有new 就是不同的对象
    Integer m = 1; //Integer.valueof()
    Integer n = 1;
    System.out.println(m == n);
    //看源码： 范围在-128~127就是直接返回


     /* public static Integer valueOf(int i){
        if(i >= IntegerCache.low && i <=IntegerCache.high)
          return IntegerCache.cache[i + (-IntegerCache.low)]
        return new Integer(i);
    }*/

    Integer x =128;
    Integer y = 128;
    System.out.println(x == y);
    //超出127，系统源码会new,就成了不同对象

  }
}
