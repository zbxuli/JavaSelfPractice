package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Person {
    public static void main(String[] args) {
        Person[] people =new Person[3];
        people[0]= new Person("li",34,"Software engineer");
        people[1] = new Person("wang",30,"test");
        people[2] = new Person("xu",55,"teacher");
        for (Person o :people) {
            System.out.println(o.toString()); 
        }
        Person temp;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length-i-1; j++) {
                if(people[j].getAge()<people[j+1].getAge()){
                    temp = people[j];
                    people[j]= people[j+1];
                    people[j+1] = temp;

                }
            }
        }
        for (Person o :people) {
            System.out.println(o.toString());
        }

        

    }
    public String name;
    int age;
    String job;
    public Person(){}
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }


}
//name ,age, job, 初始化对象数组，有三个对象，并且按照age从大到小排序，冒泡


