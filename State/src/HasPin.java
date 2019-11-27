public class HasPin implements ATMState {
    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM Machine doesn't accept more one cards");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting Card.");
        atmMachine.setCurrentState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("You already entered a PIN");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        if(cashWithdraw > atmMachine.cashInMachine){
            System.out.println("You don't have that much cash available");
            System.out.println("Ejecting Card.");
            atmMachine.setCurrentState(atmMachine.getNoCard());

        }else{
            System.out.println(cashWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashWithdraw);

            System.out.println("Ejecting Card.");
            atmMachine.setCurrentState(atmMachine.getNoCard());

            if(atmMachine.cashInMachine <= 0){
                atmMachine.setCurrentState(atmMachine.getNoCash());
            }
        }
    }
}
