package builder;

public class Test {
    public static void main(String[] args) {

        HouseBuilder stoneBuilder = new StoneHouseBuilder();
        HouseDirector stoneDirector = new HouseDirector(stoneBuilder);
        stoneDirector.constructHouse();
        House stoneHouse = stoneDirector.getHouse();
        System.out.println("Stone House: " + stoneHouse);
    }
}
