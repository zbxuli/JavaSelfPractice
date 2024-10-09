package Interface;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class HW05 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.f1();

    }
}
class A{
    private String name= "BB";
    public void show(){
        System.out.println(this.name);
    }

    public void f1(){

        class B{//定义在方法里面的类是局部内部类
            private final String NAME= "LZ";
            public void show(){
                System.out.println(NAME);
            }
        }
        B b = new B();
        b.show();//调用他只能在内部类的外部类方法里面直接写
    }

}