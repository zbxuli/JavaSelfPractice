import java.util.Scanner;

public class severalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double allAveGrade =0;

        for (int i = 0; i < 3; i++) {
            double grades = 0;
            int count=0;
            double individualGrades = 0;
            double averageGrade = 0;
            for (int j = 0; j < 5; j++) {
                individualGrades =sc.nextDouble();
                grades += individualGrades;
                if(individualGrades >= 60){
                    count++;
                }

            }
            System.out.println("pass number" + count);
            averageGrade =grades/5;
            allAveGrade +=grades;
            System.out.println(averageGrade);
        }
        System.out.println(allAveGrade/15);
    }


}
