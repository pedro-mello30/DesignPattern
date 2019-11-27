//This is the only class that needs to change, if you
//want to determine which Vehicle you want to
//provide as an option to build

public class CarVehicleBuilding extends VehicleBuilding{

    @Override
    protected Vehicle makeVehicle(String vehicleType) {
        Vehicle theCar = null;

        if(vehicleType.equals("Ferrari")){
            CarVehicleFactory carPartFactory = new FerrariVehicleFactory();
            theCar = new FerrariVehicle(carPartFactory);
            theCar.setName("Ferrari Vehicle");
        }else if(vehicleType.equals("Fusca")){
            CarVehicleFactory carPartFactory = new FuscaVehicleFactory();
            theCar = new FuscaVehicle(carPartFactory);
            theCar.setName("Fuscao Preto Vehicle");
        }

        return theCar;
    }
}
