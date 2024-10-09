package FileIO17;

import java.io.*;
import java.util.Properties;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * Properties
 * 0.是Hashtable的子类
 * 1.专门用于读写配置文件的集合
 * 配置文件的格式：
 * 键=值
 * 2.注意：键值对不需要有空格，值不需要用引号一起来，默认类型是String
 *
 * 编写一个dog.properties
 * name =tom
 * age = 5
 * color = red
 * 2.编写dog类，创建dog对象，读取dog.properties
 * 用相应的内容完成属性初始化，并输出
 * 3.将创建Dog对象，序列化到文件dog.dat下
 *
 */
public class Hw3Properties {
  public static void main(String[] args) throws IOException {
    String filePath = "src\\dog.properties";
    createProperties();
    bufferProperties(filePath);
    //创建Properties对象
    Properties properties = new Properties();
    //加载指定配置文件，properties.load（）
    properties.load(new FileReader(filePath));
    //把k-v显示在控制台
    properties.list(System.out);
    //根据key获取对应的值
    String name = properties.get("name")+"";
    int age = Integer.parseInt(properties.get("age")+"");
    String color = properties.get("color")+"";
    Dog dog = new Dog(name, age, color);
    System.out.println(dog.toString());
    String setFilePath = "d:\\mytemp\\dog.dat";
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(setFilePath));
    oos.writeObject(dog);
    oos.close();
    System.out.println("finish");
  }
  public static void bufferProperties(String filePath) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(filePath));
    String line = "";
    while((line = br.readLine())!= null){
      String[] split = line.split("=");
      System.out.println(split[0]+" "+split[1]);
    }
  }

  public static void createProperties() throws IOException {
    Properties p = new Properties();

    //如果该文件没有key,就是创建
    //如果该文件有key,就是修改
    p.setProperty("charset","utf-8");
    p.setProperty("user","汤姆");//注意保存时，是中文的Unicode码值
    p.setProperty("pwd","8888");
    //将k-v储存文件中即可，comment写了会出现在在文件最前面
    p.store(new FileOutputStream("src\\mysql.properties"),"hello world");
    System.out.println("save success!");
  }
}
class Dog implements Serializable{
  String name;
  int age;
  String color;

  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", color='" + color + '\'' +
            '}';
  }
}
