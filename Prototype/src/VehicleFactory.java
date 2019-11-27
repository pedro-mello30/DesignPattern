import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<String, Vehicle> prototypes = new HashMap<>();

    static {
        prototypes.put("fusca", new Fusca());
    }

    public static Vehicle getPrototypes(String type){
        try {
            return prototypes.get(type).copy();
        }catch (NullPointerException e){
            System.out.println("Prototype with name: "+type+", doesn't exist.");
            e.getStackTrace();
            return null;
        }
    }

    public Vehicle getClone(Vehicle vehicle){
        return vehicle.copy();
    }


}
