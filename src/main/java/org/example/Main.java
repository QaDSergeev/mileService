package org.example;

public class Main {

    public static void main(String[] args) {

        int bonus;

        BonusMilesService service = new BonusMilesService();
        bonus = service.calculate(10_000);
        System.out.println("Начислено бонусов: " + bonus);

        bonus = service.calculate(20_000);
        System.out.println("Начислено бонусов: " + bonus);
    }
}