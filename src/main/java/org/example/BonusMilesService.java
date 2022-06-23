package org.example;

public class BonusMilesService {

    private int bonus = 0;
    private int ticketPrice = 0;
    private static final int bonusPrice = 20;

    public BonusMilesService(){
    }

    public void setTicketPrice(int ticketPrice){

        this.ticketPrice = ticketPrice;
        this.bonus = 0;
    }

    public void addTicketPrice(int ticketPrice){

        this.ticketPrice += ticketPrice;
    }

    public void calculate(){

        bonus += this.ticketPrice / bonusPrice;
    }

    public void printBonusCount(){

        System.out.println(bonus);
    }
}
