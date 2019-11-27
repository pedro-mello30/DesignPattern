public class FuscaVehicle extends Vehicle{
    // We define the type of vehicle we want to create
    // by stating we want to use the factory that makes vehicles

    CarVehicleFactory carFactory;

    // The Car Vehicle required parts list is sent to
    // this method. They state that the vehicle
    // must have a engine and accessories assigned. That
    // object also states the specific parts needed
    // to make a regular Ferrari versus a Fusca

    public FuscaVehicle(CarVehicleFactory carFactory) {
        this.carFactory = carFactory;
    }

    @Override
    void makeCar() {
        System.out.println("Making Vehicle "+ getName() + "\n");

        engine = carFactory.addCEngine();
        accessories = carFactory.addCAccessories();
    }
}
