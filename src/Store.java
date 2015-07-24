import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Grinyov Vitaliy on 24.07.15.
 */
public class Store {

    private List<Product> products = new ArrayList<Product>();

    public void add(Product product){
        products.add(product);
    }

    public int count(){
        return products.size();
    }

    public Product get(int index){
        return products.get(index);
    }

    public void sortByCost(){
        Collections.sort(products);
    }

    public void print(){
        for(Product a : products)
            System.out.println(a);
    }
}
