package factorymethod;

public class Test {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Vehicle twoWheelerVehicle=twoWheelerFactory.createVehicle();
        twoWheelerVehicle.printVehicle();
    }
}
