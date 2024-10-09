package EaCollection14;

import java.util.TreeSet;

/**
 * @author Zhongbo Li
 * @version 1.0
 * HashSet : hashcode() + equals()， 底层先通过存入对象，进行运算得到一个hash值，
 * 通过hash值得到对应的索引，如果发现table索引所在的位置，没有数据，就直接存放，
 * 如果有数据，就进行equals比较（遍历比较），如果比较后，不相同，就加入，否则就不加入。
 *
 * TreeSet: 如果你传入了一个Comparator 匿名对象，就使用实现的compare去重，
 * 如果方法返回0，就认为是相同元素/数据，就不添加，如果你没有传入一个Comparator匿名对象，
 * 则以你添加的对象实现的compareable 接口的compare To 去重
 */
public class Hw5 {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    //add 方法，因为TreeSet() 构造器没有传入Comparator 接口的匿名内部类
    //所以底层Comparable
    //需要把Person转成comparable 类型，没有转就会报错
    treeSet.add(new Person());//classCastException
  }
}
class Person implements Comparable{
  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
