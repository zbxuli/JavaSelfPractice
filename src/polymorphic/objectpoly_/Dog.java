package polymorphic.objectpoly_;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Woof");
    }
}
