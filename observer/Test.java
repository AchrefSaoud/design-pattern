package observer;

public class Test {
    
    public static void main(String[] args) {
        Store store=new Store("MSI GeForce RTX 4060");

        Customer c1=new Customer("Amine");
        Customer c2=new Customer("Aymen");

        store.subscribe(c1);
        store.subscribe(c2);

        store.setProductAvailability(true);
    }
}
