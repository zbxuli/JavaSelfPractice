package Interface;

import java.awt.Color;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class HW8 {
    public static void main(String[] args) {
        Color2 green = Color2.GREEN;
        green.show();
        switch(green){
            case RED :
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case GREEN:
                System.out.println("green");
                break;

        }
    }
}
interface ColorShow{
    public void show();
}


enum Color2 implements ColorShow{
    //
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private  int redValue;
    private int greenValue;
    private int blueValue;

    Color2(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("red :"+ redValue
                        + " green : "+ blueValue
                +" blue :" + blueValue
                );
    }
}
