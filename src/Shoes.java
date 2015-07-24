/**
 * Created by Grinyov Vitaliy on 24.07.15.
 */
public class Shoes extends Product {

    private int size;
    private String color;

    static private int count = 0;
    static private double totalPrice = 0;

    public Shoes() {
        //super();
        this.setTitle("noname");
        this.setPrice(100);
        this.size = 42;
        this.color = "black";
        count++;
        totalPrice += this.getPrice();
    }

    public Shoes(String title, double price, int size, String color) {
        super(title, price);
        this.size = size;
        this.color = color;
        count++;
        totalPrice += price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void averagePrice(){
        System.out.println(totalPrice / count);
    }

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\n" +
                "Price: " + this.getPrice() + "\n" +
                "Size:  " + size + "\n" +
                "Color:  " + color + "\n";
    }
}

