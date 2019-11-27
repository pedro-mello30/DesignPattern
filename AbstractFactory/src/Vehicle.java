public abstract class Vehicle {
    private String name;

    // Newly defined objects that represent engine and accessories
    // These can be changed easily by assigning new parts
    // in FerrariVehicleFactory or FuscaVehicleFactory

    CEngine engine;
    CAccessories accessories;

     public String getName(){ return name; }
     public void setName(String name){ this.name = name; }

     abstract void makeCar();

    @Override
    public String toString() {
        String infoCar = "the " + name + " has a top speed of " + engine + " and an accessories of " + accessories;
        return infoCar;
    }
}
