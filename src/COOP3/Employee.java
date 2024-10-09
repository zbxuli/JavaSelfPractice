package COOP3;

import java.util.Objects;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Employee {
  //属性：名字，性别，年龄，职位，薪水
  //三个构造方法 1. 初始化 名字，性别，年龄，职位，薪水
  // 2. 名字，性别，年龄
  // 3. 职位薪水
    String name;
    boolean sex;
    int age;
    String level;
    double salary;
    String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return sex == employee.sex && age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(level, employee.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, level, salary);
    }

    public Employee(String level, double salary) {
        this.level = level;
        this.salary = salary;
    }
    public Employee(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String name, boolean sex, int age, String level, double salary) {
        this(name,sex,age);
        //复用构造器，但是一个函数里面只能用一次
        this.level = level;
        this.salary = salary;
    }
    // 2. 名字，性别，年龄
    // 3. 职位薪水


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void getInfo(){
        System.out.println("name");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Li", true, 33, "middle", 30000);
        e1.getInfo();

    }
}
