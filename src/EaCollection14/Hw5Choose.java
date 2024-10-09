package EaCollection14;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 如何选择集合实现类
 * 1.先判断存储的类型（一组对象【单列】或者一组键值对【双列】）
 *
 * 2.一组对象：Collection接口
 * 允许重复： List
 * 增删多： LinkedList 底层维护一个双向链表
 * 改查多：ArrayList 底层维护Object类型的可变数组
 * 不允许重复：Set
 * 无序： HashSet 底层是hash Map 维护一个哈希表 即数组+链表+红黑树
 * 排序：TreeSet
 * 插入和取出顺序一致： LinkedHashSet，维护数组+双向链表
 * 3.一组键值对 Map
 * 键无序：HashMap
 * 键排序：TreeMap
 * 键插入和取出顺序一致：LinkedHashMap
 * 读取文件 Properties
 */
public class Hw5Choose {
    public static void main(String[] args) {
        /*
        1.当我们使用无参构造器，创建TreeSet时，仍然是无序的
        2.需求：添加的元素，按照字符串大小来排序
        3.使用TreeSet 提供的一个构造器，可以传入一个比较器（匿名内部类）
        并指定排序规划
        4.TreeSet 底层是TreeMap

         */

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeSet.add("a");
        treeSet.add("bcd");
        treeSet.add("dead");
        System.out.println(treeSet);
    }
}
