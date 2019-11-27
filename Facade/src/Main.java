public class Main {

    public static void main(String[] args) {

        BankFacate theBank = new BankFacate(123456, 1234);

        theBank.withDrawCash(1000.00);
        theBank.withDrawCash(50.00);
        theBank.withDrawCash(5000.00);

        theBank.depositCash(5000.00);
    }
}
