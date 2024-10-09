package EaCollection14;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 考察HashMap 的添加机制
 */
public class Hw6 {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();
    Per aa = new Per(1001, "AA");
    Per bb = new Per(1002, "BB");
    hashSet.add(aa);
    hashSet.add(bb);
    System.out.println(hashSet);
    aa.name ="cc";
    hashSet.remove(aa);
    System.out.println(hashSet);
    hashSet.add(new Per(1001,"CC"));
    System.out.println(hashSet);
    hashSet.add(new Per(1001,"AA"));
    System.out.println(hashSet);

  }
}
class Per{
  public String name;
  public int id;

  public Per( int id,String name) {
    this.name = name;
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Per per)) return false;
    return id == per.id && Objects.equals(name, per.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    return "Per{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
  }
}
/**
 * arraylist	可变数组	不安全，高	如果使用有参构造器按照1.5倍扩容，如果是无参构造器
 * 1.第一次扩容10
 * 2.从第二次开始按照1.5倍
 *
 * Vector	可变数组 Object【】	安全，效率不高	如果是无参，默认10，满后按照2倍扩容
 * 如果是指定大小创建;Vector 则每次按照2倍扩容
 */