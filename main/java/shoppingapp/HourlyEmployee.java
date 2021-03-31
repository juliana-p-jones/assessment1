package shoppingapp;

import java.util.ArrayList;

public class HourlyEmployee extends Employee implements Discountable {

    public static final double DISCOUNT = 0.10;
    //constructor
    public HourlyEmployee(String name, char size, ArrayList<Clothing> clothingItems, double DISCOUNT) {
        super(name, size, clothingItems, DISCOUNT);
    }
    //methods
    public double getDiscount(){
        return DISCOUNT;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{}";
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        double total = clothing.getPrice() * getDiscount();
        return total;
    }
}
