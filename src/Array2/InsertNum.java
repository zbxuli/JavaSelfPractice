package Array2;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class InsertNum {
  public static void main(String[] args) {
    int[] a1 = {10,12,45,90};//这步完成很好
    int iNum = 46;
    //设置一个index是各种插入删除操作的必备操作
    int index;
    int[] a2;
    index = findIndex(iNum,a1);
    a2 = insertNum(iNum,index,a1);

    System.out.println(index);
    for (int i = 0; i < a2.length; i++) {
      System.out.print(a2[i] +"   " + '\t');
    }

  }
  //单元测试只能针对一个类里面的普通函数逻辑进行测试，无法针对main函数进行测试，需要拆分原来程序
  public static int findIndex(int insertNum,int[] a1){
    int index = -1;
    //插入数值小于第一个数，index=0
      //想办法找到index位置:小于某一个数以后，那前一个数的位置就是index
      for (int i = 0; i < a1.length; i++) {
        if(insertNum < a1[i]){
          index = i;
          break;
        }
      }
    return index;
  }

  public static int[] insertNum(int insertNum, int index, int[] a1){
    int[] a2= new int[a1.length+1];
    //插入数据: 先循环，循环里面判断index位置，是index先放，不是继续循环放以前的数
    //index的数值保持-1不变，说明是最大的，直接放最后
    if( index == -1){
      //改index，而不是直接改数组值，否则后面包含index的循环没法进行
      index = a1.length;
    }
    //同时定义i j需要在一开始的时候弄，不能分开
    for (int i = 0,j =0; i <a2.length; i++) {
        if(i !=index){
          a2[i]=a1[j];
          j++;
        }else{
          a2[i]=insertNum;
        }
      }
    return a2;
  }
}
