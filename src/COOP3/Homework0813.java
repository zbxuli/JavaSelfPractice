package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 * 做一个student类， name,sex,age,stu-id
 * Teacher 类，name,sex,age, work-age
 * Person 父类，将共同属性和方法放到Person类
 *  学生需要有学习的方法study，
 *  教师需要有教学的方法teach
 *  学生和教师都有玩的方法play，学生玩的足球，老师
 *  玩的象棋，此方法是返回字符串的，分别返回XX爱玩XX
 *  因为玩的方法名称一样，所以要求此方法定义在父类中，
 *  子类实现重写
 *
 *  定义多态数组，里面保存两个学生两个老师，要求年龄
 *  从高到低排序
 *  定义方法，形参为Person类型，功能：调用study或者teach方法
 *
 */
public class Homework0813 {
    public static void main(String[] args) {
        Tea tea = new Tea("Li", 'f', 30, 6);
        Stu stu = new Stu("zb", 'f', 18, "001001");
       /* tea.print();

        stu.print();
*/
        Person0813[] persons = new Person0813[4];
        persons[0] = tea;
        persons[1] = stu;
        persons[2] = new Tea("wang",'m',45,20);
        persons[3] = new Stu("rong",'m',23,"001002");

        Homework0813 h1 = new Homework0813();
        h1.bubblesort(persons);
       /* for (int i = 0; i < persons.length; i++) {
            persons[i].print();
        }*/
        for (int i = 0; i < persons.length; i++) {
            h1.testMethod(persons[i]);

        }


    }
    public void bubblesort(Person0813[] persons){
        Person0813 temp;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if(persons[j].getAge()<persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] =temp;

                }
            }

        }
    }
    public void testMethod(Person0813 people){
        if(people instanceof Tea){
            ((Tea) people).teach();
        } else if (people instanceof Stu) {
            ((Stu) people).study();

        }
    }
}

/* 做一个student类， name,sex,age,stu-id
        * Teacher 类，name,sex,age, work-age
        * Person 父类，将共同属性和方法放到Person类
*/
class Person0813{
    private String name;
    private char sex;
    private int age;

    public Person0813(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String play(){
        return name + "will play ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println("name: " + name);
        System.out.println("age: "+ age);
        System.out.println("sex: "+sex);

    }
}

/*  学生需要有学习的方法study，
        *  教师需要有教学的方法teach
        *  学生和教师都有玩的方法play，学生玩的足球，老师
        *  玩的象棋，此方法是返回字符串的，分别返回XX爱玩XX
        *  因为玩的方法名称一样，所以要求此方法定义在父类中，
        *  子类实现重写
*/
class Stu extends Person0813{
    private String stu_id;

    public Stu(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(getName()+ " will study");
    }

    @Override
    public String play() {
        return super.play() + "football";
    }

    @Override
    public void print() {
        System.out.println("stu_info:  ");
        super.print();
        System.out.println("stu_id: "+ stu_id);
        study();
        System.out.println(play());
    }
}
class Tea extends Person0813{
    private int work_age;
    public void teach(){
        System.out.println(getName()+" will teach");
    }
    public Tea(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.play() + "Chess";
    }

    @Override
    public void print() {
        System.out.println("teacher's info:   ");
        super.print();
        System.out.println("work_age: "+work_age);
        teach();
        System.out.println(play());
    }
}