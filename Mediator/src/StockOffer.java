public class StockOffer {
    private String stockSymbol = "";
    private int stockShares = 0;
    private int colleagueCode = 0;

    public StockOffer(String stockSymbol, int stockShares, int colleagueCode) {
        this.stockSymbol = stockSymbol;
        this.stockShares = stockShares;
        this.colleagueCode = colleagueCode;
    }

    public int getStockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }
}
