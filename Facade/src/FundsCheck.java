public class FundsCheck {
    private double cashInAccount = 2000.00;

    public double getCashInAccount() { return cashInAccount; }

    private void decreaseCash(double cashWithDrawn){
        cashInAccount -= cashWithDrawn;
    }

    private void increaseCash(double cashDeposited){
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughtMoney(double cashWithDrawn){
        if(cashWithDrawn < getCashInAccount()){
            decreaseCash(cashWithDrawn);

            System.out.println("You Did Draw Cash: " + cashWithDrawn);
            System.out.println("Current Balance is: " + getCashInAccount());

            return true;
        }else{
            System.out.println("You Try Did Draw Cash: " + cashWithDrawn);
            System.out.println("Error: You Don't Have Enought Money.");
            System.out.println("Current Balance is: " + getCashInAccount());

            return false;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCash(cashToDeposit);

        System.out.println("Current Balance is: " + getCashInAccount());
    }
}
