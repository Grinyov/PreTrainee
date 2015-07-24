/**
 * Created by Grinyov Vitaliy on 24.07.15.
 */
abstract class Product implements Comparable<Product>{
    private String title;
    private double price;

    Product(){
        this.title = "noname";
        this.price = 100.0;
    }

    Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }


    abstract public String toString();

    public int compareTo(Product o) {
        if (this.price < o.getPrice())
            return -1;
        else if (this.price == o.getPrice())
            return 0;
        else
            return 1;
    }
}
