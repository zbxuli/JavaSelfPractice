package DWrapper13;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw3SB {
  public static void main(String[] args) {
   /* Scanner sc = new Scanner(System.in);
    String s = sc.next();*/
    //f3(s);
    f4();
  }
  public static void f1(){
    //1.StringBuffer 的直接父类是AbstractStringBuilder
    //2.实现了serializable，即对象可串行化
    //3.父类中，有属性 char[] value,不是final，该value数组
    //存放字符串内容，引出存放在堆中
    //4.是个final类，不能被继承
    //5.所在变化不用每次更换地址，效率高

    //String VS StringBuilder
    //1.String 保存的是字符串常量，里面值不能更改，每次更新都要
    // 修改地址，效率低
    //2.StringBuilder 保存的是字符串变量，里面的值可更改，每次实际上
    //可以更新内容，不用每次更新地址，效率更高

    //String ->StringBuilder
    String str = "hello";
    //1.使用构造器 ： 返回的才是SB对象，对str本身没有影响
    StringBuffer sb = new StringBuffer(str);
    //2.使用append方法
    StringBuffer sb2 = new StringBuffer();
    sb2.append(str);

    //StringBuffer ->String
    StringBuffer lzb = new StringBuffer("lzb");
    //1.使用toString方法
    String s = lzb.toString();
    //2.使用构造器来做
    String s1 = new String(lzb);
  }

  public static void f2(){
    String str = null;
    StringBuffer sb = new StringBuffer();
    sb.append(str);//底层源码，调用的是AbstractStringBuilder的appendNull
    /*
     private AbstractStringBuilder appendNull() {
        ensureCapacityInternal(count + 4);
        int count = this.count;
        byte[] val = this.value;
        if (isLatin1()) {
            val[count++] = 'n';
            val[count++] = 'u';
            val[count++] = 'l';
            val[count++] = 'l';
     */
    System.out.println(sb.length());
    System.out.println(sb);
    //StringBuffer sb1 = new StringBuffer(str);
    //底层源码super(Str.length()+16);会报错，空指针异常
    //System.out.println(sb1);

  }

  public static void f3(String s){
    StringBuffer sb = new StringBuffer(s);
    for (int i = sb.lastIndexOf(".") - 3; i >0 ; i-=3) {
        sb= sb.insert(i,",");
    }
    System.out.println(sb);
  }

  public static void f4(){
    //1. String Builder 继承了AbstractStringBuilder
    //实现了serializable,说明SB对象可以串行化（对象可以网络传输，可以保存到文件）
    //3.是final 类，不能被继承
    //4.对象字符序列仍然是存放在其父类的 char[] value；因此，字符序列在堆中
    //5没有做互斥的处理，没有synchronized关键字，因此在单线程的情况下使用

    String  s = "";
    long stime = 0L;
    long etime =0L;

    stime =System.currentTimeMillis();
    for (int i = 0; i < 80000; i++) {
      s +=i;
    }
    etime = System.currentTimeMillis();
    System.out.println(etime -stime);

    StringBuffer sb = new StringBuffer("");
    stime =System.currentTimeMillis();
    for (int i = 0; i < 80000; i++) {
      sb.append(i);
    }
    etime = System.currentTimeMillis();
    System.out.println(etime -stime);

    StringBuilder sbi = new StringBuilder("");
    stime =System.currentTimeMillis();
    for (int i = 0; i < 80000; i++) {
      sbi.append(i);
    }
    etime = System.currentTimeMillis();
    System.out.println(etime -stime);

    //两个SB非常类似，方法一样，都代表可变字符序列
    //SBUffer（多线程） 效率较高，线程安全
    //sbuilder（单线程） 效率最高，但是线程不安全
    //String（一般用在配置信息） 不可变字符序列，如果多次执行这些改变串内容的操作，会导致大量副本字符串
    //对象存留在内存中，降低效率，如果这样的操作放在循环中，会极大影响
    //程序的性能： 结论，如果我们对String做大量修改，不要使用String

  }
}
