package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 */
public class Book {
    String name;
    double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //编写BOOK，定义方法updatePrice，实现更改某本书的价格，
// 具体：如果价格>150,则更改为150，如果价格>100，更改为100，否则不变
    public void updatePrice(){
        if(price >150){
            price =150;
        } else if (price>100) {
            price =100;
        }
    }
    public void getInfo(){
        System.out.println("the name of book: " + name + "," + " the price is: "+ price);
    }

    public static void main(String[] args) {

        Book b =new Book("a",29);
        b.getInfo();
        b.updatePrice();
        b.getInfo();


    }

}
