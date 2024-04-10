package polymorphic.objectpoly_;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void say(){
        System.out.println("Meow");
    }
}
