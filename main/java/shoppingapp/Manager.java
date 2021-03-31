package shoppingapp;

import java.util.ArrayList;

public class Manager extends Employee implements Discountable {

    //25 percent discount off every product
    public static final double DISCOUNT = 0.25;

    //constructor
    public Manager(String name, char size, ArrayList<Clothing> clothingItems, double DISCOUNT) {
        super(name, size, clothingItems, DISCOUNT);
    }
    //methods
    public double getDiscount(){
        return DISCOUNT;
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        double total = clothing.getPrice() * DISCOUNT;
        return total;
    }
}
