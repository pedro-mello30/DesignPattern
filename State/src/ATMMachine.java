public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasPin;
    ATMState noCash;

    ATMState currentState;

    int cashInMachine = 1500;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasPin = new HasPin(this);
        noCash = new NoCash(this);

        currentState = noCard;
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasPin;
    }

    public ATMState getNoCash() {
        return noCash;
    }

    public void setCurrentState(ATMState state){
        currentState = state;
    }

    public void insertCard(){
        currentState.insertCard();
    }

    public void ejectCard(){
        currentState.ejectCard();
    }

    public void requestMoney(int cashWithdraw){
        currentState.requestCash(cashWithdraw);
    }

    public void insertPin(int pin){
        currentState.insertPin(pin);
    }

    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }


}
