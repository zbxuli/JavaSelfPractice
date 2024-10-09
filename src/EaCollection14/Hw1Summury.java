package EaCollection14;

import COOP3.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw1Summury {
  public static void main(String[] args) {
    //1.集合主要是两组（单列集合，双列集合）
    //2.Collection接口有两个重要的子接口 List set,
    // 他们的实现子类都是单列集合
    //3.Map 接口实现的子类是双列集合，存放的k -v
    //testArrayList();
    //testIterator();
    testList();

  }

  /**
   * 可以加入null,并且可以添加多个
   * 是由数组来实现数据储存的
   * 基本等同于Vector，除了Arraylist 是线程不安全的
   */
  public static void testArrayList(){
    //collection实现子类可以存放多个元素，每个元素可以是Object
    //有些可以放重复的元素，有些不可以
    //有些可以放有序的List，有些不是有序的Set
    //没有直接实现子类，是通过它的子接口Set 和List来实现的

   /* 如源码所见，没有Synchronized关键字，所以线程不安全
   private void add(E e, Object[] elementData, int s) {
      if (s == elementData.length)
        elementData = grow();
      elementData[s] = e;
      size = s + 1;
    }*/

    ArrayList al = new ArrayList();
    al.add(1);
    al.add("jack");
    al.add(true);
    System.out.println(al);
    al.remove(0);
    System.out.println(al.contains("jack"));
    System.out.println(al.size());
    System.out.println(al.isEmpty());
    al.clear();
    System.out.println(al);
  }

  public static void testIterator(){
    //迭代器，主要用于遍历Collection集合中的元素
    //所有实现了Collection接口的集合类都有一个iterator（）方法，
    //用以返回一个实现了iterator接口的对象，即可返回一个迭代器
    //iterator 仅用于遍历集合，本身并不存放对象
    //在调用iterator.next()方法之前必须要调用iterator.hasNext()
    //进行检测，若不，且吓一条记录无效，直接调用it.next()会抛出
    //NoSuchElementException异常
    //显示所有快捷键的快捷键CTRL+J

    Collection c = new ArrayList();
    c.add(new Book("a",120));
    c.add(new Book("b",13));
    c.add(new Book("c",42));
    Iterator iterator = c.iterator();
    while (iterator.hasNext()) {
      Object next =  iterator.next();
      System.out.println(next);
    }

  }

  /**
   * List 集合类中元素有序（即添加顺序和取出顺序一致）、且可重复
   * List 集合中的每个元素都有其对应的顺序索引，即支持索引
   * 容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以
   * 根据序号存取容器中的元素
   *
   */
  public static void testList() {
    List list = new ArrayList();
    list.add(new Book("a",23));
    list.add(new Book("b",33));
    list.add(new Book("c",43));
    for (Object o :list) {
      System.out.println(o);
    }


    for (int i = 0; i < list.size() -1 ; i++) {
      for (int j = 0; j < list.size() -i-1 ; j++) {
        Book b1 = (Book) list.get(j);
        Book b2 = (Book) list.get(j+1);
        if(b1.getPrice() >b2.getPrice()){
              list.set(j,b2);
              list.set(j+1,b1);
        }

      }
    }
    for (Object o :list) {
      System.out.println(o);
    }


  }


  /**Vector
   * 底层也是一个对象数组，protected Object【】 elementData
   * 线程同步，即线程安全，类操作方法带有synchronized
   * 开发中，需要线程同步安全时，考虑使用Vector
   */
}
