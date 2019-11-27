public class Ballots implements Ballot {
    private Ballot nextBallot = null;
    int valueOfBallot;

    Ballots(int valueOfBallot){
        this.valueOfBallot = valueOfBallot;
    }

    @Override
    public void setNextBallot(Ballot nextBallot) {
        this.nextBallot = nextBallot;
    }

    @Override
    public void calculate(Withdrawal cashToWithdraw) {
        if((cashToWithdraw.value / valueOfBallot) >= 1){
            int count = (int)cashToWithdraw.value / valueOfBallot;


//            Alternative 1:
            cashToWithdraw.value -= (valueOfBallot * count);
            System.out.println("Give " + count + " Ballot" + ((count==1) ? "" : "s") + " of: " + valueOfBallot);

//            Alternative 2:
//            for (int i = 0; i < count; i++){
//                cashToWithdraw.value -= valueOfBallot;
//                System.out.println("Give Ballot of: " + valueOfBallot);
//            }

            if(cashToWithdraw.value != 0 && nextBallot != null){
                nextBallot.calculate(cashToWithdraw);
            }

        }else{
            if(nextBallot != null){
                nextBallot.calculate(cashToWithdraw);
            }else {
                System.out.println("Transaction Failed\nATM machine don't have this ballots.");
            }
        }
    }
}
