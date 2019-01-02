package com.company;

public class Main {

    public static void main(String[] args) {

        BaseBurger burger = new BaseBurger("Hamburger", "beef", "White bread"
                , false, true, false, true);
        System.out.println(burger.priceOfBurger() + " $");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        HealthyBurger healthyBurger = new HealthyBurger("beef", false, false
                , true, true, false, true);
        System.out.println(healthyBurger.priceOfBurger());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("beef","White bread",true,false);
        System.out.println(deluxeHamburger.priceOfBurger());
        //System.out.println(deluxeHamburger.getBreadType());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
