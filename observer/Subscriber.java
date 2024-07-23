package observer;

public interface Subscriber {
    void update(String product, boolean available);
}