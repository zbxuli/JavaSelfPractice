package polymorphic.objectpoly_.polyarray_;

public class Student extends People{
    private double score;

    public double getSalary() {
        return score;
    }

    public void setSalary(double salary) {
        this.score = salary;
    }

    public Student(String name, int age, double salary) {
        super(name, age);
        this.score = salary;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public String say(){
        return "Student "+ super.say() +"score= " + score ;
    }

    public void study(){
        System.out.println(getName() + " is studying Java");
    }
}
