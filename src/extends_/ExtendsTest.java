package extends_;

public class ExtendsTest {
    public static void main(String[] args) {
        pupil pupil = new pupil();
        Graduate graduate = new Graduate();
        // new classname.var is the shortcut key for build a new instance of the class

        pupil.name = "sam";
        pupil.setAge(10);
        pupil.testing();
        pupil.setScore(95);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
        graduate.name = "tom";
        graduate.setAge(22);
        graduate.testing();
        graduate.setScore(80);

    }
}
