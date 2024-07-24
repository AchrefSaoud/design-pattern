package builder;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildDoor();
        houseBuilder.buildWindows();
        houseBuilder.buildRoof();
        houseBuilder.buildSwimmingPool();
        houseBuilder.buildBackyard();
        houseBuilder.buildHeatingSystem();
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }
}

