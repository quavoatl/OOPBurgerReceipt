package com.company;

public class DeluxeHamburger extends BaseBurger {

    private boolean chips;
    private boolean drink;

    public DeluxeHamburger(String meat, String breadType, boolean chips, boolean drink) {
        super("Burger deluxe", meat, breadType, false, false, false, false);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double priceOfBurger() {
        int itemsAdded = 0;
        double priceOfChips = 1.2;
        double priceOfDrink = 0.90;
        double finalPrice = basePrice;

        if (this.chips == true) {
            finalPrice += priceOfChips;
            itemsAdded++;
            System.out.println("You added chips to your burger. Additional cost : "
                    + priceOfChips + " $");
        }
        if (this.drink == true) {
            finalPrice += priceOfDrink;
            itemsAdded++;
            System.out.println("You added drink to your burger. Additional cost : ");
        }


        System.out.println("Base burger price is " + basePrice + " $");
        System.out.print("You added " + itemsAdded + " items to burger. Grand total is : " + " $");
        return finalPrice;
    }
}
