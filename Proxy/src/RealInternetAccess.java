public class RealInternetAccess implements OfficeInternetAccess {
    private String userName;

    public RealInternetAccess(String newUserName) {
        this.userName = newUserName;
    }

    @Override
    public void grantAccess() {
        System.out.println("Internet Access granted for user: " + this.userName);
    }
}
