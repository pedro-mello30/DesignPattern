public class Main {

    public static void main(String[] args) {

        Ferrari ferr = new Ferrari();

        VehicleFactory vehicleFactory = new VehicleFactory();
        Ferrari cloneFerr = (Ferrari) vehicleFactory.getClone(ferr);

        System.out.println("True Ferrari: "+ System.identityHashCode(System.identityHashCode(ferr)));
        System.out.println("Clone Ferrari: "+ System.identityHashCode(System.identityHashCode(cloneFerr)));

//        -----------------------------------
        System.out.println("---");

        if(args.length > 0){
            for (String type : args){
                Vehicle prototype = VehicleFactory.getPrototypes(type);
                if(prototype != null){
                    System.out.println(prototype.getClass());
                }
            }
        }

    }
}
