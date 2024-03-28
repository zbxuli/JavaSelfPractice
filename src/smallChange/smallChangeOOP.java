package smallChange;

import java.util.Date;
import java.util.Scanner;

public class smallChangeOOP {
    Scanner sc = new Scanner(System.in);

    Date dateSmall =new Date();

    public double balance;
    public double benefit;
    public double money;

    public String spendingReason;
    public String details = "";
    public boolean loop = true;

    //show menu
    public void showMenu(){

        do{
            System.out.println("===================smallChangeMenu========================");
            System.out.println("\t"+"\t"+'\t'+ "1.the details of smallChanges");
            System.out.println("\t"+"\t"+'\t'+ "2.get income");
            System.out.println("\t"+"\t"+'\t'+ "3.expend money");
            System.out.println("\t"+"\t"+'\t'+ "4.exit");
            System.out.println("please choose (1-4):");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    this.showDetails(i);
                    break;
                case 2:
                    this.getBenefits(i);
                    break;
                case 3:
                    this.expense(i);
                    break;
                case 4:
                    this.exit(i);
                    break;
                default:
                    System.out.println("you seem to put wrong input, please choose again");

            }
        }while(loop);

    }
    //details
    public void showDetails(int i){
        System.out.println("~~~~~~~~~~~the details of smallChanges~~~~~~~~~~");
        System.out.println(details);

    }
    //benefits
    public void getBenefits(int i){

        System.out.println("~~~~~~~~~~~income~~~~~~~~~~");
        benefit = sc.nextDouble();
        if (benefit <= 0){
            System.out.println( "your benefit should more than 0");
            return; // can not fine the correct benefit condition
            // we can use "return" to break the if sentence
        }
        balance += benefit;
        details += "get benefits\t" + benefit + "\t" + dateSmall + "\t balance:\t" + balance + '\n';

    }
    //expense
    public void expense(int i){
        System.out.println("~~~~~~~~~~~expense~~~~~~~~~~~~");
        money = sc.nextDouble();

        if (money > balance | money <= 0){
            System.out.println( "you should spend less than your balance" + balance);
            return;
        }
        balance -= money;
        spendingReason = sc.next();
        details += spendingReason + "\t\t"  + (-money) + "\t" + dateSmall + "\tbalance:\t" + balance + '\n';
    }
    //exit
    public void exit(int i){
        String answer = ""; // this key should define within the method and out of the while sentence
        // if not the logic is wrong, you can not break the loop properly
        while(true){
            System.out.println("Are you sure to exit?yes press y,no press n");
             answer= sc.next();
            if ("n".equals(answer) || "y".equals(answer)){
                break;
            }
        }
        if (answer.equals("y")){
            loop = false;
        }


    }
}
