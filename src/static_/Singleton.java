package static_;

public class Singleton {
    public static void main(String[] args) {

        //Han style
        System.out.println("Han style");
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(gf.toString());
        GirlFriend gf2= GirlFriend.getInstance();
        System.out.println(gf==gf2);

        //Hungry Han style
        System.out.println("Hungry Han style");
        Cat ins = Cat.getInstance();
        System.out.println(ins.toString());
    }
}
class Cat{
    private String name;
    //Usually, heavyweight objects may result in situations
    // where objects are created but not used in a Han style manner
    private static int n =100;
    //In order to be able to return the GF object in a static method,
    // it needs to be decorated as static
    private static Cat cats;

    /*Ensure that only one object can be created
    1. Privatize the constructor
    2. Directly create an object within the class, which is of type static
    3. Provide a public static method to return the object
    4.Lazy style, only returns the cat object when the user uses an individual instance,
     and when called again later, returns the last cat object created, ensuring a singleton
    * */
    public Cat(String name) {
        System.out.println("cat constructor is called");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cats == null){
            cats =new Cat("kitty");
        }
        return cats;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class GirlFriend{
    private String name;
    //Usually, heavyweight objects may result in situations
    // where objects are created but not used in a Han style manner
    private static int n =100;
    //In order to be able to return the GF object in a static method,
    // it needs to be decorated as static
    private static GirlFriend gf = new GirlFriend("Taylor");

    /*Ensure that only one object can be created
    1. Privatize the constructor
    2. Directly create an object within the class, which is of type static
    3. Provide a public static method to return the object
    * */
    public GirlFriend(String name) {
        System.out.println("constructor is called");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
