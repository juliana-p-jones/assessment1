package shoppingapp;

import java.util.ArrayList;

public class Employee extends Customer {
    //vars
    private final double DISCOUNT;
    //constructor
    public Employee(String name, char size, ArrayList<Clothing> clothingItems, double DISCOUNT) {
        super(name, size, clothingItems);
        this.DISCOUNT = DISCOUNT;

    }
//getter
    public double getDiscount(){
    return DISCOUNT;
    }

    public void printEmpPriceAfterDisc() {

    }
}
