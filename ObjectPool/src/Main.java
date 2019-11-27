public class Main {

    public static void main(String[] args) {
	// write your code here
        Store store = new Store();

        WorkSpace workSpace = store.checkOut();




        workSpace.workSpace();

        WorkSpace workSpace1 = store.checkOut();

        workSpace1.workSpace();
        System.out.println(workSpace1.hashCode());

        store.checkIn(workSpace1);
        System.out.println(store.count);

        System.out.println(workSpace.hashCode());
        store.checkIn(workSpace);
        System.out.println(store.count);

        workSpace = store.checkOut();
        System.out.println(workSpace.hashCode());


    }
}
