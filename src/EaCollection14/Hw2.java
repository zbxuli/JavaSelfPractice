package EaCollection14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("宝马",400000));
        arrayList.add(new Car("宾利",5000000));
        for (Object o :arrayList) {
            System.out.println(o);
        }
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("宾利"));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        //记住迭代器写法
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()) {
            Object next =  iter.next();
            System.out.println(next);
        }
        arrayList.clear();


    }
}
class Car{
    public String name;
    public int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
