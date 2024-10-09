package FileIO17;

import java.io.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * 需求：
 * 1.将int num = 100 这个int 数据保存到文件中
 * 注意不是100数字，而是int 100 ,并且，能够从文件中
 * 直接恢复 int 100
 * 2.将Dog dog = new Dog("小黄"，3)这个狗对象保存在
 * 文件中，并且能够从文件中恢复
 * 上面的需求，就是能够将 基本数据类型 或者 对象进行
 * 序列化 和 反序列化操作
 *
 * 序列化 和 反序列化：
 * 1.序列化就是在保存数据时，保存数据的值和数据类型
 * 2.反序列化就是在恢复数据时，恢复数据的值和数据类型
 * 3.需要让某个对象支持序列化机制，则必须让其类是可序列化的，
 * 为了让某个类是可序列化的，该类必须实现如下两个接口之一：
 * Serializable：这是一个标记接口，没有方法
 * Externalizable: 该接口有方法需要实现，因此我们一般实现
 * 上面的
 *
 */
public class Hw7ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "d:\\FilePractice\\data.dat";
        ooutStream(path);
        iintStream(path);

    }

    public static void ooutStream(String path) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        //序列化数据到文件
        oos.writeInt(100); //int -> Integer(实现了Serializable)
        oos.writeBoolean(false);// boolean ->Boolean(实现了Serializable)
        oos.writeChar('b');//char -> Character (实现了Serializable)
        oos.writeDouble(100.0);//double ->Double(实现了Serializable)
        oos.writeUTF("I am great");//String (实现了Serializable)

        oos.writeObject(new Cat("Liz",3));
        oos.close();
    }

    public static void iintStream(String path) throws IOException, ClassNotFoundException {

        //1.读取（反序列化）的顺序需要和你保存数据（序列化）的顺序一致
        //2.否则会出现异常
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object cat = ois.readObject();
        System.out.println("运行类型"+cat.getClass());
        System.out.println(cat);//底层 Object ->Cat


    }
}

/** 注意事项和细节说明
 * 1.读写顺序要一致
 * 2.要求实现序列化或反序列化对象，需要实现Serializable
 * 3.序列化的类中建议添加SerialVersionUID，为了提高版本的兼容性
 * 4.序列化对象时，默认将里面所有属性都进行序列化，但除了static或transient修饰的成员
 * 5.序列化对象时，要求里面属性的类型也需要实现序列化接口
 * 6.序列化具备可继承性，也就是如果某类已经实现了序列化，则它的所有子类
 * 也默认实现了序列化
 *
 */

class Cat implements Serializable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}