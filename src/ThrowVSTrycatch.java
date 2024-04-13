/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class ThrowVSTrycatch {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}
class ReturnExceptionDemo{
    static void methodA(){
        try {
            System.out.println("into method A");
            throw new RuntimeException("create exception");
        }finally {
            System.out.println("use method A's finally");
        }
    }
    static void methodB(){
        try {
            System.out.println("into methodB");
            return;
        }finally {
            System.out.println("use method B's finally");
        }
    }
}