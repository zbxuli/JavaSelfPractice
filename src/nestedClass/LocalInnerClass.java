package nestedClass;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class LocalInnerClass {
  public static void main(String[] args) {
    LocalOuter localOuter = new LocalOuter();
    localOuter.m1();
  }
}

class LocalOuter{
    private int n1 = 100;
    private void m2(){
      System.out.println("LocalOuter m2");
    }
    public void m1(){
      /*
       * 1.Defined at a local inner class in an outer class, such as within a method, and with a class name
       * 2. Access modifiers cannot be added because their status is a local variable, and local variables cannot use modifiers.
       *  But you can use the final modifier because local variables can also use the final modifier
       * 3. Scope: Only within the method or code block that defines it
       */
      final class Inner{ //inner class:Essentially, it is still a class
        private int n1 = 10;
        public void f1(){
          //1. Can directly access all members of external classes, including private ones,such as n1 and m2
          System.out.println("Inner class n1: " + n1);
          //7. If the members of an external class and a local internal class have the same name,
          // the principle of proximity is followed by default.
          // If you want to access members of an external class, you can use (external class name. this. member) to access them
          System.out.println("Outer class n1: " + LocalOuter.this.n1);
          m2();
        }
      }
      //5. External classes accessing members of local internal classes
      //Access method: Create an object and then access it (note: must be within the scope)
      //6. External classes cannot access local inner classes (the status of a local inner class is a local variable)
      Inner inner = new Inner();
      inner.f1();
    }

}