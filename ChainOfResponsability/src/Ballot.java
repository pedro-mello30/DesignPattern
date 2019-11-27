public interface Ballot {
    public void setNextBallot(Ballot nextBallot);
    public void calculate(Withdrawal cashToWithdraw);
}
