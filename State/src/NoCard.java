public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }


    @Override
    public void insertCard() {
        System.out.println("Inseting Card");
        atmMachine.setCurrentState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("No Have Card In Machine.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Insert A Card, Please.");
    }

    @Override
    public void requestCash(int cashWithdraw) {
        System.out.println("Insert A Card, Please.");
    }
}
