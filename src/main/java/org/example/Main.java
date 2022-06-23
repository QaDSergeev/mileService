package org.example;

public class Main {

    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        service.setTicketPrice(10_000);
        service.calculate();
        service.printBonusCount();

        service.setTicketPrice(5_000);
        service.calculate();
        service.printBonusCount();

        service.addTicketPrice(20_000);
        service.calculate();
        service.printBonusCount();
    }
}