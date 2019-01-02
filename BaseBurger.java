package com.company;

public class BaseBurger {

    public String burgerName;
    public String meat;
    public String breadType;
    public boolean tomato;
    public boolean lettuce;
    public boolean carrot;
    public boolean ketchup;
    public double basePrice;

    public BaseBurger(String burgerName,String meat, String breadType, boolean tomato, boolean lettuce
            , boolean carrot, boolean ketchup) {
        this.burgerName = burgerName;
        this.meat = meat;
        this.breadType = breadType;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.carrot = carrot;
        this.ketchup = ketchup;
        this.basePrice = 5;
    }

    public double priceOfBurger() {

        int itemsAdded = 0;
        double priceOfTomato = 0.25;
        double priceOfLettuce = 0.30;
        double priceOfCarrot = 0.20;
        double priceOfKetchup = 0.25;

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

        System.out.println("Base burger price is " + basePrice + " $");
        System.out.print("You added " + itemsAdded + " items to burger. Grand total is : " + " $" );
        return finalPrice;

    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadType() {
        return breadType;
    }
}
