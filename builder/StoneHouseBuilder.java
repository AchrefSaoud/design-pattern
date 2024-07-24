package builder;

public class StoneHouseBuilder implements HouseBuilder{

    private String walls;
    private String door;
    private String windows;
    private String roof;
    private boolean hasSwimmingPool;
    private boolean hasBackyard;
    private boolean hasHeatingSystem;

    @Override
    public void buildWalls() {
        this.walls = "Stone Walls";
    }

    @Override
    public void buildDoor() {
        this.door = "Iron Door";
    }

    @Override
    public void buildWindows() {
        this.windows = "Iron Windows";
    }

    @Override
    public void buildRoof() {
        this.roof = "Stone Roof";
    }

    @Override
    public void buildSwimmingPool() {
        this.hasSwimmingPool = true;
    }

    @Override
    public void buildBackyard() {
        this.hasBackyard = false;
    }

    @Override
    public void buildHeatingSystem() {
        this.hasHeatingSystem = true;
    }

    @Override
    public House getHouse() {
        return new House(walls, door, windows, roof, hasSwimmingPool, hasBackyard, hasHeatingSystem);
    }
}
