public class Main {

    public static void main(String[] args) {

        StockMediator ibov = new StockMediator();

        Colleague broker = new GormanSlacks(ibov);
        Colleague broker2 = new JTPoorman(ibov);

        ibov.addColleague(broker);
        ibov.addColleague(broker2);

        ibov.saleOffer("PETR3", 50, broker.getColleagueCode());
        ibov.saleOffer("DMMO3", 70, broker.getColleagueCode());
        ibov.saleOffer("PRIO3", 80, broker.getColleagueCode());

        ibov.buyOffer("OSXB3", 100, broker.getColleagueCode());
        ibov.buyOffer("CEGR3", 100, broker.getColleagueCode());

        ibov.saleOffer("OSXB3", 100, broker2.getColleagueCode());
        ibov.saleOffer("CEGR3", 100, broker2.getColleagueCode());

        ibov.buyOffer("PETR3", 50, broker2.getColleagueCode());

        ibov.displayInventoryOffers();
    }
}
