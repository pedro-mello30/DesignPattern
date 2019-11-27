public class ProxyInternetAccess implements OfficeInternetAccess{
    private String userName, password;
    private String code = "1234";
    private RealInternetAccess access;

    public ProxyInternetAccess(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    public void grantAccess() {
        if(checkCode(password)){
            access = new RealInternetAccess(userName);
            access.grantAccess();
        }else {
            System.out.println("Error: No Internet Granted.");
        }
    }

    public boolean checkCode(String passwordChecked){
        return (passwordChecked.equals(code))? true : false;
    }
}
