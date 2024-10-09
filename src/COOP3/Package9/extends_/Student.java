package COOP3.Package9.extends_;

public class Student {
    public String name;
    public   int age;
    private double score;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showinfo(){
        System.out.println("student " + name + "age " + age + "score" + score);
    }


}
