package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
}

class LabeledPoint extends Point{
  String name;

  public LabeledPoint(String name,double x, double y ) {
    super(x, y);
    this.name = name;
  }

  @Override
  public String toString() {
    return "LabeledPoint{" +
            "name='" + name + '\'' + super.toString()+
            '}';
  }

}

class test{
  public static void main(String[] args) {
    LabeledPoint blackFriday = new LabeledPoint("black friday",1929, 230.07);
    System.out.println(blackFriday.toString());
  }
}
