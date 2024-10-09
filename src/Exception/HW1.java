package Exception;

/**
 * @author Zhongbo Li
 * @version 1.0
 * NumberformatException
 * ArrayIndexOutofBoundException
 * Ari
 */
public class HW1 {
  public static void main(String[] args) {
    try {
      if(args.length!=2) {
        throw new ArrayIndexOutOfBoundsException("参数个数不对");
      }
      int n1 = Integer.parseInt(args[0]);
      int n2 = Integer.parseInt(args[1]);

      double res = Calculate1.cal(n1,n2);
      System.out.println( res);

    }catch (NumberFormatException e){
      System.out.println("输入格式错误");
    }catch (ArrayIndexOutOfBoundsException e){
      System.out.println("数字数量太多");
    }catch (ArithmeticException e){
      System.out.println("被除数不能为0");
    }
  }
}
class Calculate1{
  public static double cal(int n1,int n2){
    return n1/n2;
  }
}
