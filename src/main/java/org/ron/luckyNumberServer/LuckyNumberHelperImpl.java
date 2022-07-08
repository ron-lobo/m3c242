package org.ron.luckyNumberServer;

public class LuckyNumberHelperImpl implements ILuckyNumberHelper {

    private LuckyNumberService luckyNumberService;

    public LuckyNumberHelperImpl(LuckyNumberService luckyNumberService) {
        this.luckyNumberService = luckyNumberService;
    }

    public int getNumber() {
        return Math.abs(luckyNumberService.getNum());
    }
}