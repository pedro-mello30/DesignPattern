public class Main {

    public static void main(String[] args) {

        GovernmentsTax governmentsTax = new GovernmentsTax();
        HolidayTax holidayTax= new HolidayTax();

        Necessity rice = new Necessity(1.0);
        Wine cabernet = new Wine(20.0);


        System.out.println("Governments Tax");
        System.out.println(rice.accept(governmentsTax));
        System.out.println(cabernet.accept(governmentsTax));

        System.out.println("\nHoliday Tax");
        System.out.println(rice.accept(holidayTax));
        System.out.println(cabernet.accept(holidayTax));
    }
}
