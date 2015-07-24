/**
 * Created by Grinyov Vitaliy on 24.07.15.
 *
 */
public class StoreRunner {
    public static void main(String[] args) {
        Shoes pair1 = new Shoes(); //initial default construktor
        Shoes pair2 = new Shoes("Braska", 250.0, 42, "black");
        Shoes pair3 = new Shoes("Ecco", 200.0, 43, "brown");

        Boots pair5 = new Boots(); //initial default construktor
        Boots pair6 = new Boots("Braska", 750.0, 38, "white", "leather");
        Boots pair7 = new Boots("Baskoni", 600.0, 39, "black", "leather");
        System.out.print("average price shoes ");
        Shoes.averagePrice();
        System.out.print("average price boots ");
        Boots.averagePrice();
        System.out.println();

        Store store = new Store();

        store.add(pair1);
        store.add(pair2);
        store.add(pair3);
        store.add(new Shoes("Lloyd", 300.0, 42, "black"));
        store.add(pair5);
        store.add(pair6);
        store.add(pair7);
        store.add(new Boots("Golderr", 650.0, 37, "black", "leather"));

        System.out.println("unsorted");
        System.out.println("--------------------------------------");
        store.print();
        store.sortByCost();
        System.out.println("sorted by price");
        System.out.println("--------------------------------------");
        store.print();
    }
}
