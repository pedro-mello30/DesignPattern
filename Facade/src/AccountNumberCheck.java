public class AccountNumberCheck {


    private int accountNumber = 123456;

    private int getAccountNumber(){ return accountNumber; }

    public boolean accountCheck(int accountNumberChecked){
        return getAccountNumber() == accountNumberChecked ? true : false;
    }
}
