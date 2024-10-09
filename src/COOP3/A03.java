package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class A03 {
    public static void main(String[] args) {
        int[] arr={2,4,5};
        A03 a3=new A03();
        int[] arrC= a3.copuArr(arr);
        for (int i = 0; i < arrC.length; i++) {
            System.out.println(arrC[i]);
        }
    }
    public int[] copuArr(int[] arr){
        // 每次新创建数组需要new 一个
        int[] arrCopy=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] =arr[i];
        }
        return arrCopy;

    }
}
//编写类A03, 实现数组的复制功能copyArr,输入旧数组，返回一个新数组，元素和旧数组一样