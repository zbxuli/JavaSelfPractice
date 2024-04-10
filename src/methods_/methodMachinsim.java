package methods_;

public class methodMachinsim {
    public static void main(String[] args) {
        //Passing mechanism of primitive data types in methods
        int a = 1;
        int b = 2;
        Change change = new Change();
        change.swap(a,b);
        System.out.println("main's a and b:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        //Passing mechanism of reference data types array in methods
        int[] arr ={1,2,3};
        change.changeArr(arr);
        System.out.println("main's array:");
        for (Object o :arr) {
            System.out.println(o);
        }

        //Passing mechanism of reference data types objects in methods
        Change c = new Change();
        c.test = 3;
        c.obj1(c);
        System.out.println("main's test:");
        System.out.println(c.test);


    }
}
 class Change{
    int test ;
    public void swap(int a, int b){
        System.out.println("before swap: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }
    public void changeArr(int [] arr){
        arr[0] = 100;
         System.out.println("changeArr's array:");
         for (Object o :arr) {
             System.out.println(o);
         }
     }

    /* public void obj(Change c){
        c = null;
     }
*/
     public void obj1(Change c){
        c.test = 2;
     }



 }