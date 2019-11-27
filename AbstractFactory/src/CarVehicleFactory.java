// With an Abstract Factory Pattern you won't
// just build Vehicles, but also all of the components
// for the Vehicles

// Here is where you define the parts that are required
// if an object wants to be an car vehicle


public interface CarVehicleFactory {
    public CEngine addCEngine();
    public CAccessories addCAccessories();
}
