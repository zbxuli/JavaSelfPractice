package COOP3.Package9.extends_;

/**
 * 1.子类继承了所有属性和方法，非私有的属性和方法可以在子类直接访问。但是私有属性和方法不能在子类直接访问，需要通过公共方法去访问。
 * 2.子类必须调用父类的构造器，完成父类的初始化
 * 3.当创建子类对象时，不管使用子类哪个构造器，默认情况总会去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用super（）去指定使用父类哪个构造器完成对父类的初始化工作，否则，编译不会通过。
 * 4.如果希望指定去调用父类的某个构造器，则显式调用下 ：super（参数列表）
 * 5.super在使用时，必须放在构造器第一行
 * 6.super（）和this（）都只能放在构造器第一行，因此两个方法不能共存在一个构造器中
 * 7.Java所有类都是Object类的子类
 * 8.父类构造器的调用不限于直接父类！将一直往上追溯到Object类（顶级父类）
 * 9.子类最多只能继承一个父类（指的是直接继承），即Java中是单继承机制
 * 10.不能滥用继承，子类和父类之间必须满足is-a 的逻辑关系
 * Music extends Person False
 * Cat extends Anmial True
 *
 * 本质：
 * 1.当子类创建好后，建立查找关系
 * 2.按照查找规则返回信息
 * 1）首先查看子类是否具有该属性
 * 2）如果子类具有，并且可以访问，则返回信息
 * 3）如果子类没有，则向父类查看（如果父类具有，并且可以访问，就返回信息）
 * 4）如果父类没有，就按照3继续访问上一级，知道Object……
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        Detail detail = new Detail();
        /* 2.Subclasses must call the parent class's constructor to complete the initialization of the parent class.
         2.the result will print base() and detail()
         */
        detail.say();
        /*
        3.When creating an object of a subclass, regardless of which constructor of the subclass is used,
        by default, the no-argument constructor of the parent class is always called.
        If the parent class does not provide a no-argument constructor,
        it is necessary in the subclass constructor to specify which constructor of
        the parent class should be used for initialization using `super()`. Otherwise, the compilation will not pass."
        */
    }
}
