package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class FindMax {
  public static void main(String[] args) {
    A01 a =new A01();
    double[] arr= {};
    //定义和使用都得使用包装类Double
    Double max = a.max(arr);
    if(arr !=null){
      System.out.println(max);
    }else{
      System.out.println("arr输入有误");
    }

  }
}

//编写类A01 ，定义方法max，实现某个double数组的最大值，并返回
class A01{
  public Double max(double[] arr){
    if(arr != null && arr.length>0){
      double max= arr[0];
      for (int i = 1; i < arr.length; i++) {
        if(arr[i]>max){
          max = arr[i];
        }
      }
      return max;
    }else {
      return null;
    }
  }

}