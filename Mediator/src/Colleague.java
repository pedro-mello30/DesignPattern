public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueCode(int colleagueCode) {
        this.colleagueCode = colleagueCode;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

    public void buyOffer(String stock, int shares){
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }

    public void saleOffer(String stock, int shares){
        mediator.buyOffer(stock, shares, this.colleagueCode);
    }
}
