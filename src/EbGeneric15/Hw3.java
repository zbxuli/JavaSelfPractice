package EbGeneric15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Hw3 {
  public static void main(String[] args) {
    Empl lo = new Empl("Lo", 23309, new MyDate(10, 1, 1995));
    Empl wang = new Empl("wang", 29389, new MyDate(1, 20, 1994));
    Empl wan = new Empl("wan", 26389, new MyDate(1, 20, 1994));
    ArrayList<Empl> arrayList = new ArrayList();
    arrayList.add(lo);
    arrayList.add(wang);
    arrayList.add(wan);
    arrayList.sort(new Comparator<Empl>() {
      @Override
      public int compare(Empl e1,Empl e2 ) {
        if(!( e1 instanceof Empl && e1 instanceof Empl)){
          System.out.println("type is not correct");
          return 0;
        }
        int name = e1.getName().compareTo(e2.getName());
        if(name !=0){
          return name;
        }
        return e1.getBirthday().compareTo(e2.getBirthday());
      }
    });
    Iterator<Empl> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      Empl next = (Empl) iterator.next();
      System.out.println(next);

    }

  }
}
class Empl{
  private String name;
  private double sal;
  private MyDate birthday;

  public Empl(String name, double sal, MyDate birthday) {
    this.name = name;
    this.sal = sal;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSal() {
    return sal;
  }

  public void setSal(double sal) {
    this.sal = sal;
  }

  public MyDate getBirthday() {
    return birthday;
  }

  public void setBirthday(MyDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "Empl{" +
            "name='" + name + '\'' +
            ", sal=" + sal +
            ", birthday=" + birthday +
            '}';
  }
}
class MyDate implements Comparable<MyDate>{
  private int month;
  private int day;
  private  int year;

  public MyDate(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  @Override
  public String toString() {
    return "MyDate{" +
            "month=" + month +
            ", day=" + day +
            ", year=" + year +
            '}';
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public int compareTo(MyDate o) {
    int y = year - o.getYear();
    if(y != 0){
      return y;
    }
    int m  = month - o.getMonth();
    if(m !=0){
      return m;
    }
    return day - o.getDay();
  }
}