import java.lang.reflect.Array;
import java.util.ArrayList;

public class StockMediator implements Mediator{

    private ArrayList<StockOffer> stockSale;
    private ArrayList<StockOffer> stockBuy;
    private ArrayList<Colleague> colleagues;
    private int colleagueCode = 0;


    public StockMediator() {
        stockSale = new ArrayList<StockOffer>();
        stockBuy = new ArrayList<StockOffer>();
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague newColleague){
        colleagues.add(newColleague);
        colleagueCode++;
        newColleague.setColleagueCode(colleagueCode);
    }


    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;

        for (StockOffer offer : stockSale){
            if((offer.getStockSymbol() == stock)  && (offer.getStockShares() == shares)){
                System.out.println(shares + " shares of " + stock + " sold by colleague code " + colleagueCode);
                stockSale.remove(offer);
                stockSold = true;
            }

            if(stockSold){ break; }
        }

        if(!stockSold){
            System.out.println(shares + " shares of " + stock + " added to inventory Buy Offers by colleague code " + colleagueCode);

            StockOffer newOffer = new StockOffer(stock, shares, colleagueCode);
            stockBuy.add(newOffer);
        }
    }



    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;

        for (StockOffer offer : stockBuy){
            if((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)){
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + colleagueCode);
                stockBuy.remove(offer);
                stockBought = true;
            }

            if(stockBought){ break; }
        }

        if(!stockBought){
            System.out.println(shares + " shares of " + stock + " added to inventory Sales Offers by colleague code " + colleagueCode);

            StockOffer newOffer = new StockOffer(stock, shares, colleagueCode);
            stockSale.add(newOffer);
        }
    }

    public void displayInventoryOffers(){
        System.out.println("------------------------------");
        System.out.println("Sale Offers Inventory:\n");
        for (StockOffer offer : stockSale){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\n------------------------------");
        System.out.println("\nBuy Offers Inventory:\n");
        for (StockOffer offer : stockBuy){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }
    }
}
