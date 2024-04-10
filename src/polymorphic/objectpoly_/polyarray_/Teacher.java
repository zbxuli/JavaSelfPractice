package polymorphic.objectpoly_.polyarray_;

public class Teacher extends People{
    private double salary;

    public double getScore() {
        return salary;
    }

    public void setScore(double score) {
        this.salary = score;
    }

    public Teacher(String name, int age,double score) {
        super(name,age);
        this.salary = score;
    }

    public String say(){
        return "Teacher "+ super.say() + "salary= " + salary;
    }
    public void teach(){
        System.out.println(getName() + " is teaching Java");
    }
}
