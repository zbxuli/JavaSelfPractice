package polymorphic.objectpoly_;

public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void feed(Animal animal, Food food){
        System.out.println("master "+ name + " feeds " + animal.getName() + " with food " + food.getName());
    }
}
