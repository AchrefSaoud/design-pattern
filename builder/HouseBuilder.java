package builder;

public interface HouseBuilder {
    void buildWalls();
    void buildDoor();
    void buildWindows();
    void buildRoof();
    void buildSwimmingPool();
    void buildBackyard();
    void buildHeatingSystem();
    House getHouse();
}
