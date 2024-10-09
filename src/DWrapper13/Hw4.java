package DWrapper13;

import COOP3.Book;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw4 {
  public static void main(String[] args) {
    /*for (int i = 0; i < 10; i++) {
      System.out.println((int)(2+ Math.random()*6));

    }*/

   /* int[] in = {1,3,5,2};
    System.out.println(Arrays.toString(in));
    Arrays.sort(in);
    System.out.println(Arrays.toString(in));*/

    /* f2
    String s = "abdcd";
    String s1 = null;
    try {
      s1 = f2(s, 2, 3);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    System.out.println(s1);*/


    /*f3
    String name ="sg";
    String code="123496";
    String email ="dfkd@kdkc.ld";
    try {
      f3(name,code,email);
      System.out.println("成功");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }*/

   /* String s ="Han Shun Ping";
    System.out.println(f4(s));*/


    String s ="jksdajkf292 20dj3HH";
    f5(s);
  }
  public static void f1(){
    Book[] arr =new Book[4];
    arr[0] = new Book("acgggg",100);
    arr[1] = new Book("b",120);
    arr[2] = new Book("cccc",90);
    arr[3] = new Book("dwwew",50);
   /* Arrays.sort(arr, new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return (int)(o2.getPrice()- o1.getPrice());
      }
    });
    System.out.println(Arrays.toString(arr));
*/
    Arrays.sort(arr, new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return o1.getName().length()-o2.getName().length();
      }

    });
    System.out.println(Arrays.toString(arr));
  }

  /**
   * 将字符串中指定部分进行反转，例如将”abcdef"反转为"aedcbf"
   * 编写方法
   * 先把方法定义明确
   * 把String 转换成char
   * 分析交换方式
   */
  public static String f2(String s, int start, int end){

    //参数验证：
    //重要编程技巧
    //写出正确情况
    //取反即可
    if((s != null && start<end && end < s.length())){
      throw new RuntimeException("Info is incorrect");
    }
    char[] chars = s.toCharArray();
    char temp = ' ';
    for (int i = start,j =end; i <j ; i++,j--) {
      temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
    }
    return new String(chars);

  }

  /**
   * 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
   * 1.用户名长度为2，3，4
   * 密码长度为6，要求全是数字，isDigital
   * 邮箱中包含@ 和.，并且@在。前面
   */
  public static String f3(String name,String code,String email){
    if(!(name.length()<=4 && name.length()>=2)){
      throw  new RuntimeException("用户名长度不对");
    }
    if(!(isDigital(code) && code.length()==6)){
      throw new RuntimeException("密码格式不正确");
    }
    if(!(email.indexOf("@")>0 &&
            email.indexOf("@")<email.indexOf("."))){
      throw new RuntimeException("邮箱格式不正确");
    }

    return "Success!";
  }
  public static boolean isDigital(String code){
    char[] chars = code.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if(chars[i]<'0' || chars[i]>'9'){
        return false;
      }
    }
    return true;
  }

  /**
   * 完成输出格式要求的字符串
   * 输入形式为 Han Shun Ping 的人名，以Ping，Han .S的形式打印出来
   * 思路：
   * 1. 将数据用” “分割
   * 2.然后放到String[] ,最后一个第一个输出，然后拼接","
   * 3.然后输出第一个 加空格，加。
   * 4.最后把第二个转换成char[],取第一个输出
   *
   * 可以String.format
   * 数据校验
    */
  public static String f4(String s){
    /*String res="";
    String[] s1 = s.split(" ");

    res += s1[2]+"," + s1[0]+ " ."+s1[1].substring(0,1);
    return res;*/
    if(s == null){
      return  "信息不能为空";
    }
    String[] s1 = s.split(" ");
    if(s1.length !=3){
      return "输入格式不正确";
    }
    return String.format("%s,%s .%c",s1[2],s1[0],s1[1].toUpperCase().charAt(0));
  }

  public static void f5(String s){
    if(s == null){
      System.out.println("输入错误");
    }
    int len= s.length();
    int numCount = 0;
    int upperCount = 0;
    int lowerCount = 0;
    int otherCount = 0;
    for (int i = 0; i < len; i++) {
      if(s.charAt(i) >= '0' && s.charAt(i)<= '9'){
        numCount++;
      }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
        lowerCount++;
      }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
        upperCount++;
    }else {
      otherCount++;
      }
    }
    System.out.println("数："+ numCount);
    System.out.println("big "+upperCount);
    System.out.println("small "+lowerCount);
    System.out.println("other "  +otherCount);

  }
  // f f t f f t
}
