package org.ron.luckyNumberServer;

public class LuckyNumberServer {

    private LuckyNumberHelper luckyNumberHelper;

    public static void main(String[] args) {
        DepA depA = new DepA();
        DepB depB = new DepB();
        LuckyNumberDB luckyNumberDB = new LuckyNumberDB(depB);
        LuckyNumberService luckyNumberService = new LuckyNumberService(luckyNumberDB, depA);
        LuckyNumberHelper luckyNumberHelper = new LuckyNumberHelper(luckyNumberService);
        LuckyNumberServer luckyNumberServer = new LuckyNumberServer(luckyNumberHelper);
        System.out.println(luckyNumberServer.getLuckyNumber());
    }

    public LuckyNumberServer(LuckyNumberHelper luckyNumberHelper) {
        this.luckyNumberHelper = luckyNumberHelper;
    }

    public int getLuckyNumber() {
        return luckyNumberHelper.getNumber();
    }
}
