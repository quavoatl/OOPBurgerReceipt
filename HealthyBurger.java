package com.company;

public class HealthyBurger extends BaseBurger {

    private boolean salmon;
    private boolean prawn;

    public HealthyBurger(String meat, boolean tomato, boolean lettuce, boolean carrot
            , boolean ketchup, boolean salmon, boolean prawn) {
        super("Healthy burger", meat, "Brown rye", tomato, lettuce, carrot, ketchup);
        this.salmon = salmon;
        this.prawn = prawn;
        this.breadType = "Brown rye";
        this.burgerName = "Healthy burger";
    }

    @Override
    public double priceOfBurger() {
        int itemsAdded = 0;
        double priceOfTomato = 0.25;
        double priceOfLettuce = 0.30;
        double priceOfCarrot = 0.20;
        double priceOfKetchup = 0.25;
        double priceOfSalmon = 0.75;
        double priceOfPrawn = 0.85;


        double finalPrice = basePrice;

        if (this.tomato == true) {
            finalPrice += priceOfTomato;
            itemsAdded++;
            System.out.println("You added tomato to your burger. Additional cost : "
                    + priceOfTomato + " $");
        }
        if (this.lettuce == true) {
            finalPrice += priceOfLettuce;
            itemsAdded++;
            System.out.println("You added lettuce to your burger. Additional cost : "
                    + priceOfLettuce + " $");
        }
        if (this.carrot == true) {
            finalPrice += priceOfCarrot;
            itemsAdded++;
            System.out.println("You added carrot to your burger. Additional cost : "
                    + priceOfCarrot + " $");
        }
        if (this.ketchup == true) {
            finalPrice += priceOfKetchup;
            itemsAdded++;
            System.out.println("You added ketchup to your burger. Additional cost : "
                    + priceOfKetchup + " $");
        }
        if (this.salmon == true) {
            finalPrice += priceOfSalmon;
            itemsAdded++;
            System.out.println("You added salmon to your burger. Additional cost : "
                    + priceOfSalmon + " $");
        }
        if (this.prawn == true) {
            finalPrice += priceOfPrawn;
            itemsAdded++;
            System.out.println("You added prawn to your burger. Additional cost : "
                    + priceOfPrawn + " $");
        }


        System.out.println("Base burger price is " + basePrice + " $");
        System.out.print("You added " + itemsAdded + " items to burger. Grand total is : " + " $" );
        return finalPrice;

    }
}




