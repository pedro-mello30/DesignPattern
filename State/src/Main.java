public class Main {

    public static void main(String[] args) {
	    ATMMachine atmMachine = new ATMMachine();

	    atmMachine.insertCard();
	    atmMachine.requestMoney(1500);

	    atmMachine.insertPin(123);
	    atmMachine.requestMoney(1500);


	    atmMachine.insertCard();
	    atmMachine.insertPin(123);
    }
}
