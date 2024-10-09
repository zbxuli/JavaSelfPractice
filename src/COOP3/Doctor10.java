package COOP3;

import java.util.Objects;

/**
 * @author Zhongbo Li
 * @version 1.0
 *  name,age,job,gender,sal
 *  相应的getter setter方法，5个参数的构造器，重写
 *  父类的equals方法：public Boolean equals（object obj）
 *  并判断测试类中创建的两个对象是否相等，相等就是判断属性是否相同
 */
public class Doctor10 {
    public static void main(String[] args) {
        Doctor10 li = new Doctor10("Li", 30, "dl", "female", 20000);
        Doctor10 li2 = new Doctor10("Li", 31, "dl", "female", 20000);
        System.out.println(li.equals(li2));

    }
    String name;
    int age;
    String job;
    String gender;
    double sal;

    public Doctor10(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor10 doctor10)) return false;
        return getAge() == doctor10.getAge() && Double.compare(doctor10.getSal(), getSal()) == 0 && getName().equals(doctor10.getName()) && getJob().equals(doctor10.getJob()) && getGender().equals(doctor10.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getJob(), getGender(), getSal());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
