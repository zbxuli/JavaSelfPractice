package polymorphic.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //show object polymorphic
        //animal's compilation type is Animal, animal's operation type is Dog
        Animal animal = new Dog("doggy");
        //Because at runtime, when executing a line change,
        // the animal runtime type is Dog, so say is the cry of Dog
        animal.say();//Woof
        animal = new Cat("catty");
        animal.say();

        People people = new People("lisa");
        Pig pig = new Pig("piggy");
        Rice rice = new Rice("rice");
        people.feed(pig,rice);


    }
}
