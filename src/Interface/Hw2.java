package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 1.在 Frock类中声明私有的静态属性currentNum【int 类型】
 * 初始值10000，作为衣服出场的序列号起始值
 * 2.声明共有的静态方法getNextNum,作为生成上衣唯一序列号的方法
 * 每调用一次，将在currentNum增加100，并作为返回值
 * 3.在TestFrock类的main方法中，分两次调用getNextNum，获取
 * 序列号并输出打印
 * 4.在Frock类中声明serialNUmber属性，并提供对应get方法
 * 5.在Frock类的构造器中，通过调用getNextNum 方法为Frock对象
 * 获取唯一序列号，赋给serialNumber属性
 * 6.在TestFrock类的main方法中，分别创建三个Frock对象
 * 并打印三个对象序列号，验证是否为按100递增
 */
class Frock{
  //加了static可以不用new 一个新对象直接调用里面的static属性和方法
  private static int currentNum=10000;
  private int serialNumber;

  public Frock() {
    this.serialNumber =getNextNum();;
  }

  public int getSerialNumber() {

    return serialNumber;
  }

  public static int getNextNum(){
    currentNum += 100;
    return currentNum;
  }
}
public class Hw2 {
  public static void main(String[] args) {
    System.out.println(Frock.getNextNum());
    System.out.println(Frock.getNextNum());
    Frock frock = new Frock();
    Frock frock1 = new Frock();
    Frock frock2 = new Frock();
    System.out.println(frock.getSerialNumber());
    System.out.println(frock1.getSerialNumber());
    System.out.println(frock2.getSerialNumber());

  }
}
