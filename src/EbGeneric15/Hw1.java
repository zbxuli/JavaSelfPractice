package EbGeneric15;

import java.util.*;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw1 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("john",12));
        //students.add(100);//不能添加成功，因为类型固定了
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        HashMap<String, Student> hMap = new HashMap<String, Student>();
        hMap.put("1",new Student("john",12));
        hMap.put("2",new Student("smith",12));
        Set<Map.Entry<String, Student>> entries = hMap.entrySet();
        for (Object o :entries) {
            System.out.println(o);
        }
        Collection<Student> values = hMap.values();
        System.out.println(values);


    }
}
class Student{
    public String name;
    public int age;
    public Student(String name,int age){
        super();
        this.name =name;
        this.age =age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
