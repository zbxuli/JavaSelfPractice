package EaCollection14;

import java.util.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw3 {
  public static void main(String[] args) {
    Map emp = new HashMap();

    emp.putIfAbsent("jack",650);
    emp.put("tom",1200);
    emp.put("smith",2900);
    System.out.println("1"+ emp);

    emp.replace("jack",2600);
    System.out.println(emp);
    Set keySet = emp.keySet();
    for (Object o : keySet) {
      emp.put(o,(Integer)emp.get(o)+100);
    }
    System.out.println("2 " +emp);

    Set entry= emp.entrySet();
    Iterator iterator = entry.iterator();
    while (iterator.hasNext()) {
      Object next =  iterator.next();
      System.out.println("3 "+ next);
    }
    Collection values = emp.values();
    for (Object o : values) {
      System.out.println("4 " +o);
    }


  }
}
