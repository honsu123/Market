public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        Human hm2 = new Human();
        hm.name = "Вася";
        hm2.name = "Петя";
        Market market = new Market();

        market.acceptToMarket(hm);
        market.acceptToMarket(hm2);
        market.takeInQueue(hm);
        market.takeInQueue(hm2);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.update();
    }
}