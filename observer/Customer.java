package observer;

public class Customer implements Subscriber {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String product, boolean available) {
        if (available) {
            System.out.println("Hi " + name + ", the " + product + " is now available!");
        } else {
            System.out.println("Hi " + name + ", the " + product + " is not available yet.");
        }
    }
    
}
