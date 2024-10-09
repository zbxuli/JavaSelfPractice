package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class FindIndex {
    public static void main(String[] args) {
        String[] arr={"a","b"};
        String a ="a";
        A02 b =new A02();
        int index= b.find(arr,a);
        System.out.println(index);
    }
}
class A02{
    public int find(String[] arr,String a) {
        int index = 0;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    index =i;
                    return index;
                }
            }
            return -1;
        } else {
            return -1;
        }

    }
}
//编写A02，定义方法find，实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1

