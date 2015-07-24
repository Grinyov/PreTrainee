/**
 * Created by Grinyov Vitaliy on 24.07.15.
 */
public class Boots extends Product {

    private int size;
    private String color;
    private String material;

    static private int count = 0;
    static private double totalPrice = 0;

    public Boots() {
        //super();
        this.setTitle("noname");
        this.setPrice(100);
        this.size = 37;
        this.color = "black";
        this.material = "leather";
        count++;
        totalPrice += this.getPrice();
    }

    public Boots(String title, double price, int size, String color, String material) {
        super(title, price);
        this.size = size;
        this.color = color;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static void averagePrice(){
        System.out.println(totalPrice / count);
    }

    @Override
    public String toString() {
        return "Title: " + this.getTitle() + "\n" +
                "Price: " + this.getPrice() + "\n" +
                "Size:  " + size + "\n" +
                "Color:  " + color + "\n" +
                "Size:  " + material + "\n";

    }
}
