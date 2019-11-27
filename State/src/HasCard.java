public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
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
        if(pin == 123){
            System.out.println("Correct PIN.");
            atmMachine.setCurrentState(atmMachine.getHasPin());
        }else{
            System.out.println("Incorrect PIN.");
            System.out.println("Ejecting Card.");
            atmMachine.setCurrentState(atmMachine.getNoCard());
        }
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("Insert a PIN.");
    }
}
