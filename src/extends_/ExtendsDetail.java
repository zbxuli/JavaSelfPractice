package extends_;

public class ExtendsDetail {
    public static void main(String[] args) {
        Detail detail = new Detail();
        /* 2.Subclasses must call the parent class's constructor to complete the initialization of the parent class.
         2.the result will print base() and detail()
         */
        detail.say();
        /*
        3.When creating an object of a subclass, regardless of which constructor of the subclass is used,
        by default, the no-argument constructor of the parent class is always called.
        If the parent class does not provide a no-argument constructor,
        it is necessary in the subclass constructor to specify which constructor of
        the parent class should be used for initialization using `super()`. Otherwise, the compilation will not pass."
        */
    }
}
