package polymorphic.objectpoly_.polyarray_;

public class PolyArray {
    public static void main(String[] args) {

        //define object array
        People[] persons = new People[5];
        persons[1] = new People("cat",10);
        persons[2] = new Student("panda",5,74);
        persons[3] = new Student("dog",7,88);
        persons[4] = new Teacher("kangaroo",34,3899);
        persons[0] = new Teacher("bird",23,6477);

        //dynamic binding mechanism
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student){
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            }else{
                System.out.println("this person is not belong to any organization");
            }
        }


    }
}
