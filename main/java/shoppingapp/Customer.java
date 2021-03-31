package shoppingapp;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Person {
    //vars
    private char size;
    private ArrayList<Clothing> clothingItems;

    public Customer(String name, char size, ArrayList<Clothing> clothingItems) {
        super(name);
        this.size = size;
        this.clothingItems = clothingItems;
    }

    //getter
    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", clothingItems=" + clothingItems +
                '}';
    }
}
