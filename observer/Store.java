package observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String product;
    private boolean available;

    public Store(String product) {
        this.product = product;
        this.available = false;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void setProductAvailability(boolean available) {
        this.available = available;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(product, available);
        }
    }
}
