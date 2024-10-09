package Array2;


import java.util.Random;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class RandomArr {
  //随机生成10个数，保存到数组，倒序打印求平均值，求最大值和最大值下标


  public static void main(String[] args) {
    int[] arr = RandomGeneration();
    int sum=0;
    int avg;
    //倒序打印
    for (int i = arr.length-1; i >= 0 ; i--) {
      System.out.println(arr[i]);
      sum +=  arr[i];
    }
    //求均值
    avg = sum/ arr.length;
    System.out.println("Average number" + avg);

    //并寻找是否有8
    for (int i = arr.length-1; i >= 0 ; i--) {
      if(arr[i]==8){
        System.out.println("the arr contains 8");
      }
    }
    int min = getMin(arr);
    int max = getMax(arr);
    System.out.println(min);
    System.out.println(max);

  }

  public static int[] RandomGeneration(){
    int[] arr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < 10; i++) {
      //生成随机数 1-100
      arr[i] = (int)(Math.random()*100) +1;
    }
    return arr;
  }

  public static int getMax(int[] arr){
    int max = 0;
    int m = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]>max){
        max = arr[i];
        m = i;
      }
    }
    return m;
  }
  public static int getMin(int[] arr){
    int min = 100;
    int m = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]<min){
        min = arr[i];
        m = i;
      }
    }
    return m;
  }
}
