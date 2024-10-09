package Array2;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class BubbleSort {
  public static void main(String[] args) {
     int[] arr = {20, -1,89,2,890,7};
     //冒泡排序，从大到小
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]<arr[j+1]){
          temp = arr[j] ;
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
