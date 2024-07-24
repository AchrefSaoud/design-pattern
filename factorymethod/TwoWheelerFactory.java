package factorymethod;
//Concrete Creators (Concrete Factories)
public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}