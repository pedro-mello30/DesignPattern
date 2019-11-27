public class Main {

    public static void main(String[] args) {
        Ballot hundredBallot = new Ballots(100);
        Ballot fiftysBallot = new Ballots(50);
        Ballot twentysBallot = new Ballots(20);
        Ballot tensBallot = new Ballots(10);
        Ballot fivesBallot = new Ballots(5);

        hundredBallot.setNextBallot(fiftysBallot);
        fiftysBallot.setNextBallot(twentysBallot);
        twentysBallot.setNextBallot(tensBallot);
        tensBallot.setNextBallot(fivesBallot);


        Withdrawal withdrawal = new Withdrawal(595);

        hundredBallot.calculate(withdrawal);
    }
}
