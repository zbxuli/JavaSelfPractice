package EaCollection14;

import COOP3.Employee;

import java.util.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 1.Map 与collection并列存在，用于保存具有映射关系的数据 key-value
 * 2.map 中的key 和value 可以是任何引用类型的数据，会封装到
 * HashMap$Node对象中
 * 3.map 中的key 不允许重复，原因和Hashset 一样
 * 4.value可重复
 * 5.Map中的key 可以为null,value也可以为null,
 * 注意key 为null，只能有一个，value可以有多个null
 * 6.常用String类作为Map的key
 * 7.key 和value之间存在单向一对一关系，即通过指定的key
 * 总能找到对应的value
 *
 * 小结：
 *1.接口常用实现类：HashMap,hashtable 和properties
 * 2.HashMap是map接口使用频率最高的实现类
 * 3.如果添加相同的key，则会覆盖原来的k-v,等同于修改k不会替换，v会替换
 * 4.和HashSet一样，不保证映射的顺序，因为底层是以hash表的方式存储的
 * 5.HashMap没有实现同步，因此是线程不安全的
 *
 * 底层机制
 * 1.HashMap底层维护了Node类型的数组table，默认为null
 * 2.在创建对象时，将加载因子初始化为0.75
 * 3.当添加k-v 时，通过key的哈希值得到在table的索引，然后
 * 判断该索引处是否有元素，如果没有元素直接添加，如果该索引处
 * 有元素，继续判断该元素的key 和准备加入的key相比，相等直接替换
 * 不相等需要判断是树结构还是链表结构，做出相应处理
 */
public class Hw4Map {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,"a");
        map.put(2,"c");
        /*
        1.k-v 最后是hashMap$Node node = newNode(hash,key,value,null)
        2.k-v为了方便程序员遍历，还会创建EntrySet集合，该集合存放的元素类型Entry
        而一个Entry对象就有k,v EntrySet<Entry<k,v>>
        即： transient Set<Map.Entry<K,V> entrySet;
        3.entrySet中，定义类型是Map.Entry 但实际上存放的还是HashMap$Node

         */
        /*Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object o :set) {
            System.out.println(o.getClass());
            //从hashMap$Node 取出k-v
            //先做一个向下转型
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }*/
        //getIteration(map);
        f1();

    }

    public static void getIteration(HashMap map){
         //containsKey 查找键是否存在
        //keySet 获取所有的键
        //entrySet 获取所有关系 k-v
        //values 获取所有的值

        /*
        1.先取出所有的key 通过key 取出对应的Value
         */
        System.out.println("method 1");
        Set set = map.keySet();
        for (Object o :set) {
            System.out.println(o + " "+ map.get(o));
        }
        System.out.println("method 2");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next+ " "+ map.get(next));
        }

        /*
        2.把所有values取出
         */
        System.out.println("method 3");
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }
        Iterator it = values.iterator();
        System.out.println("method 4");
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }

        /*
        3.entrySet来获取
         */
        System.out.println("method 5");
        Set entrySet = map.entrySet();
        for (Object o :entrySet) {
            System.out.println(o);
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " "+ m.getValue());

        }
        System.out.println("method 6");
        Iterator itit = entrySet.iterator();
        while (itit.hasNext()) {
            Object next = itit.next();
            System.out.println(next);
            Map.Entry m = (Map.Entry) next;
            System.out.println(m.getKey() + " "+ m.getValue());
        }



    }

    /**
     *使用hashmap 添加3个员工对象，要求
     * k； 员工ID
     * v: 员工对象
     * 并遍历显示工资 > 18000的员工
     * 员工类：姓名，工资，员工ID
     */
    public static void f1(){
        HashMap hashMap = new HashMap();
        hashMap.put("001",new Employee("li",2000,"001"));
        hashMap.put("002",new Employee("zhong",18900,"002"));
        hashMap.put("003",new Employee("bo",20000,"003"));
        Set set = hashMap.keySet();
        for (Object o :set) {

            /*if( ((Employee) o).getSalary()>18000){
                System.out.println(o);
            }*/
            Object o1 = hashMap.get(o);
            if(((Employee) o1).getSalary() >18000){
                System.out.println(o+ " "+ o1);
            }
        }
        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry m = (Map.Entry) next;
            if(((Employee) m.getValue()).getSalary() >18000){
                System.out.println(m);
            }

        }

    }

    /*
    HashTable
    存放键值对
    1.k v 都不能为null
    2.使用方法和Hashmap一样
    3.线程安全
    4.效率较低
     */



}
