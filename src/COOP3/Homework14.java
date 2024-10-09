package COOP3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Homework14 {
  public static void main(String[] args) {
    Random r =new Random();


    Scanner s =new Scanner(System.in);


    for (int i = 0; i < 3; i++) {
      System.out.println("please input number :");
      int bot = r.nextInt(0,2);
      int tom = s.nextInt();
      GuessGame g = new GuessGame(bot, tom);
      g.compare();
      g.info();
    }
  }
}
class GuessGame{
  int ComputerNum;
  int TomNum;

  public GuessGame(int computerNum, int tomNum) {
    ComputerNum = computerNum;
    TomNum = tomNum;
  }

  public String compare(){
    if(ComputerNum == TomNum){
      return "equal";
    }else if(ComputerNum == 0 && TomNum == 1){
      return "Computer win";
    } else if (ComputerNum == 1 && TomNum == 2) {
      return "Computer win";
    } else if (ComputerNum == 2 && TomNum == 0) {
      return "Computer win";
    }else{
      return "Tom win";
    }
  }
  public void  info(){
    System.out.println( " ComputerNum " + ComputerNum+
            " TomNum  :" + TomNum +
            " the result :" + compare());
  }
}

//电脑猜拳rock-paper-scissors，电脑每次随机生成0，1，2
//0 表示石头，1 表示剪刀，2 表示 布
//可以显示输赢次数
