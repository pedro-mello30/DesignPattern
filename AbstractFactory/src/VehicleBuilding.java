public abstract class VehicleBuilding {

    // This acts as an ordering mechanism for creating Vehicles that have a Engine, Accessories


    protected abstract Vehicle makeVehicle(String vehicleType);


    public Vehicle orderVehicle(String vehicleType){
        Vehicle theCar = makeVehicle(vehicleType);

        theCar.makeCar();
        return theCar;
    }
}
