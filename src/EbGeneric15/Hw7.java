package EbGeneric15;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 定义个泛型类，在其中定义一个Map成员变量，Map的键为String
 * 值为T类型
 * Junit 测试框架
 * @Test alt + enter : add to classpath
 */
public class Hw7 {
  public static void main(String[] args) {

  }
  @Test
  public void test(){
    DAO<User> userDAO = new DAO<User>();
    userDAO.save("1",new User(1,12,"a"));
    userDAO.save("2",new User(2,13,"b"));
    userDAO.save("3",new User(3,14,"c"));
    System.out.println(userDAO.list());
    userDAO.update("3",new User(3,33,"c"));
    System.out.println(userDAO.list());
    System.out.println(userDAO.get("1"));
  }
}
class User{
  private int id;
  private int age;
  private String name;

  public User(int id, int age, String name) {

    this.id = id;
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}
class DAO<T>{
  private Map<String,T>  map = new HashMap<>();

  //保存T类型的对象到Map成员变量中
  public void save(String id,T entity){
    map.put(id,entity);
  }

  //从map仲获取id对应的对象
  public  T get(String id){
    return map.get(id);
  }

  //替换map中key为id的内容，改为entity对象
  public void update(String id, T entity){
      map.replace(id,entity);
  }

  //返回map中存放的所有T对象
  public List<T> list(){
    List<T> list = new ArrayList<>();
    //遍历map
    Collection<T> values = map.values();
    for (T o :values) {
      list.add(o);
    }
    /*Set<String> keys = map.keySet();
    for (String s : keys) {
      list.add(map.get(s));
    }*/


    return list;
  }

  //删除指定id对象
  public void delete(String id){
    map.remove(id);
  }
}