public class Main {

    public static void main(String[] args) {
	// write your code here

        VehicleBuilding makeCars = new CarVehicleBuilding();

        Vehicle theFerrari = makeCars.orderVehicle("Ferrari");
        System.out.println(theFerrari + "\n");

        Vehicle theFusca = makeCars.orderVehicle("Fusca");
        System.out.println(theFusca + "\n");
    }
}
