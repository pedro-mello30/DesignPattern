// Here we define a basic component of a vehicle
// Any part that implements the interface CAccessories
// can replace that part in any vehicle

public class CAccessoriesFerrari implements CAccessories {
    // Vehicle contains a reference to the object
    // CAccessories. It is stored in the field accessories

    // The Strategy design pattern is being used here

    public String toString(){
        return "Multimedia sound";
    }

}
