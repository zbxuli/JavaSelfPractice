package polymorphic.objectpoly_;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(){
        System.out.println("animal cry");
    }
}
