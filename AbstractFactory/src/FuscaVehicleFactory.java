// This factory uses the CarVehicleFactory interface
// to create very specific Fusca Vehicle

// This is where we define all of the parts the vehicle
// will use by defining the methods implemented
// being CEngine and CAccessories

public class FuscaVehicleFactory implements CarVehicleFactory {
    @Override
    public CEngine addCEngine() {
        return new CEngineFusca();
    }

    @Override
    public CAccessories addCAccessories() {
        return new CAccessoriesFusca();
    }
}
