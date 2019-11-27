public class Main {

    public static void main(String[] args) {

        OfficeInternetAccess access = new ProxyInternetAccess("Jaelson", "1234");
        access.grantAccess();

        OfficeInternetAccess accessA = new ProxyInternetAccess("Joelmar", "12345");
        accessA.grantAccess();

    }
}
