package static_.interface_;

public class InterfaceVsExtends {
    public static void main(String[] args) {
        Child child = new Child();
        child.speak();
        child.flyable();
        child.swimming();

    }
}

class Parents{
    public void speak(){
        System.out.println("In normal cases, people can speak language");
    }
}
class Child extends Parents implements Fly,Swim{
    @Override
    public void flyable() {
        System.out.println(" take tools to fly");
    }

    @Override
    public void swimming() {
        System.out.println(" learn to swim");
    }
}

interface Fly{
    void flyable();
}
interface Swim{
    void swimming();
}
