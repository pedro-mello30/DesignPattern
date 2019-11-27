public class BankFacate {

    private int numberAccount;
    private int code;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeBank welcomeBank;

    BankFacate(int numberAccount, int code){
        this.numberAccount = numberAccount;
        this.code = code;

        welcomeBank = new WelcomeBank();

        accountChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public int getCode() {
        return code;
    }

    public void withDrawCash(double cashToGet){
        if(accountChecker.accountCheck(getNumberAccount()) &&
                codeChecker.isCodeCorrect(getCode()) &&
                fundsChecker.haveEnoughtMoney(cashToGet)){
            System.out.println("Transaction Complete.");

        }else{

            System.out.println("Transaction Failed.");
        }
    }

    public void depositCash(double cashToDeposit){
        if(accountChecker.accountCheck(getNumberAccount()) &&
                codeChecker.isCodeCorrect(getCode())){
            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete.");

        }else{
            System.out.println("Transaction Failed.");

        }

    }

}
