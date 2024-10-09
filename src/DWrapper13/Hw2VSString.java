package DWrapper13;

import COOP3.Person;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 包装类和String类互相转化
 * String 实现了Serializable，可以串行化，序列化
 * 实现了comparable ，说明可以比较大小
 * Unicode编码，一个字符占两个字节
 * Final 类，不能被其他类继承
 * 有属性 private final char value[] 用于存放字符串内容
 * value是final类型，不可以修改地址值，但是内容可以变化
 */
@SuppressWarnings("ALL")
public class Hw2VSString {
  public static void main(String[] args) {
    f6();
  }
  public static void f1(){

    //装箱类和String类互相转换
    //Integer ->String
    Integer n =1;//自动装箱
    String str1= n +" ";
    String str2 = n.toString();
    String str3 = String.valueOf(n);

    //String -> Integer
    String str ="123";
    Integer m = Integer.parseInt(str);//自动装箱
    Integer m1 = new Integer(str);
  }
  public static void f2(){
    //创建方式
    String s = "a";
    //先从常量池查看是否有”a“数据空间，如果有，直接指向；
    //如果没有则重新创建，然后指向，最终指向常量池的空间地址
    String s1 = new String("a");
    //先在堆中创建空间，里面维护了value属性，指向常量池的”a“空间，
    // 如果有，指向，没有创建，最终指向堆中的空间地址
    System.out.println(s.equals(s1));
    //equals被重写，只比较值
    System.out.println(s == s1);
    System.out.println(s == s1.intern());
    //如果池已经包含一个等于此String对象的字符串（用
    // equals（object）方法确定），则返回池中的字符串。
    // 否则，将此String对象添加到池中，并返回String对象引用
    System.out.println(s1 == s1.intern());
  }

  public static void f3(){
    Person p1 = new Person();
    p1.name = "abc";
    //想直接用”=“ 赋值，该变量必须为public
    Person p2 = new Person();
    p2.name ="abc";
    System.out.println(p1.name.equals(p2.name));
    //equals()比较内容，肯定T
    System.out.println(p1.name == p2.name);
    //p1,p2 先创建了，后赋值，因为堆里面有，所以name直接指向同一个
    //所以为T
    System.out.println(p1.name == "abc");
    //有基础的string, 直接比较值 所以T

    String s1= new String("bca");
    String s2 = new String("bca");
    System.out.println(s1 ==s2);
    //都是new 出来的，所以F
  }
  public static void f4(){
    String a ="hello"+"hi";//直接看池
    //编译器不傻，做了优化，判断创建常量池对象，是否有引用指向
    //a = "hellohi";所以就创建了一个对象
    String b="hello";
    String c="hi";
    String d= b  + c;
    //1.先创建一个Stringbuilder
    //2.执行sb.append(hello)
    //3.执行sb.append(hi)
    // String d = sb.toString()
    //最后其实是c指向堆中的对象（String） value[] ->池中”hellohi“
    String e ="hellohi";
    System.out.println(d== e);
  }
  public static void f5(){
    Test test = new Test();
    test.change(test.str,test.ch);
    //test在创建change方法时，会在栈里面开辟一个新空间
    //新空间的str会把内容改成Java,但是当方法使用完成，新空间将销毁
    //change中的str因为在池中，也将随之销毁
    //但是ch 是改变堆中 value地址对应的h，所以结果也会变
    System.out.println(test.str +" and");
    System.out.println(test.ch);
  }

  public static void f6(){
    String str1 = "wer@ter@";
    String str2 = "Wer@ter@";
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
    System.out.println(str1.length());
    System.out.println(str1.indexOf("@"));
    System.out.println(str1.lastIndexOf("@"));
    System.out.println(str1.substring(1,3));
    System.out.println();
    System.out.println(str1.toUpperCase());
    System.out.println(str2.toLowerCase());


  }

}
class Test{
   String str = new String("lzb");
   final char[] ch = {'j','a','v','a'};
   public void change(String str,char ch[]){
     str ="java";
     ch[0] = 'h';
   }
}