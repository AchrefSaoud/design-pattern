package factorymethod;
//Concrete Creators (Concrete Factories)
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}