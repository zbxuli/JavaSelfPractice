package EaCollection14;

import COOP3.Employee;

import java.util.HashSet;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * Set 接口常用方法 和 Collection接口一样
 * 遍历方式： 可以使用迭代器
 * 增强for
 * 不能使用索引的方式来获取
 * 1.set接口的实现类对象不能存放重复元素，可以添加一个null
 * 2.set接口对象存放数据是无序的
 * 取出的顺序虽然不是添加的顺序，但是它固定
 */
public class Hw3Set {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("t",3));
        hashSet.add(new Employee("t",3));
        hashSet.add(new Employee("tom",3));

        //employee 类里面需要重写equals方法，
        //如果属性相同，在使用equals时，返回true
        //如果属性值相同时，计算hashcode()时，返回相同的结果
        //1.先获取元素的hash值（使用hashcode方法）
        //2.对哈希值进行运算，得出一个索引值，即为要存放在哈希表中的位置号
        //3.如果该位置没有其他元素，则直接存放，如果该位置已经有
        //其他元素，则需要进行equals()判断，如果相等，不添加，不相等，添加
        System.out.println(hashSet);
    }
}
/**
 * HashSet底层是hashmap
 * 1.添加一个元素时，先得到hash值，会转成 索引值
 * 2.找到存储数据table,看这个索引位置是否已经存放的有元素
 * 3.如果有，调用equals比较，如果相同，就放弃添加，如果不相同，
 * 则添加到最后
 *
 */