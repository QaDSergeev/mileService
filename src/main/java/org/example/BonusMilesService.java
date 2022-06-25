package org.example;

public class BonusMilesService {
    private static final int bonusPrice = 20;

    public BonusMilesService(){
    }

    public int calculate(int ticketPrice){

        return ticketPrice / bonusPrice;
    }

    public void printBonusCount(){

    }
}
