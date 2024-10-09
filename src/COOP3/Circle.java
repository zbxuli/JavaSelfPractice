package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
//定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
public class Circle {
    public static void main(String[] args) {
        Circle c= new Circle(3);
        c.info();
    }
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getLength(){
        double length;
        length = 2* 3.14* r;
        return length;
    }

    public double getArea(){
        double area;
        area = 3.14 * r* r;
        return area;
    }

    public void info(){
        System.out.println("the r is :" + r + ", the area is :"+ getLength() + ", the area is :"+ getArea());
    }
}
