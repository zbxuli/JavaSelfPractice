package COOP3.Package9.extends_;

/**
 * 代表父类引用，用于访问父类的属性，方法和构造器
 * 1.访问父类属性，但不能访问父类的private 属性
 * 2.访问父类方法，但不能访问父类的private方法
 * 3.访问父类的构造器，super(参数列表)：只能放在构造器的第一句，
 * 只能出现一句。
 *
 * 1.调用父类的构造器的好处（分工明确，父类属性由父类初始化，
 * 子类属性由子类进行初始化）
 * 2.当子类中有和父类中成员（属性和方法）重名时，为
 * 了访问父类的成员，必须通过super。如果没有重名，
 * 使用super、this直接访问是一样的效果。
 * 3.访问不限于直接父类，如果爷爷类和本类中有同名的成员，
 * 也可以使用super去访问爷爷类的成员；如果多个基类中都
 * 有同名成员，使用super访问遵循就近原则。A->B->C
 */
public class SuperTest {
    public static void main(String[] args) {
        B b = new B();
        b.hi();
        b.hello();
        b.sum();

    }
}
