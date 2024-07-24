package builder;

public class House {
    private String walls;
    private String door;
    private String windows;
    private String roof;
    private boolean hasSwimmingPool;
    private boolean hasBackyard;
    private boolean hasHeatingSystem;

    public House(String walls, String door, String windows, String roof, boolean hasSwimmingPool, boolean hasBackyard, boolean hasHeatingSystem) {
        this.walls = walls;
        this.door = door;
        this.windows = windows;
        this.roof = roof;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasBackyard = hasBackyard;
        this.hasHeatingSystem = hasHeatingSystem;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", door=" + door + ", windows=" + windows + ", roof=" + roof +
               ", hasSwimmingPool=" + hasSwimmingPool + ", hasBackyard=" + hasBackyard + ", hasHeatingSystem=" + hasHeatingSystem + "]";
    }
}
