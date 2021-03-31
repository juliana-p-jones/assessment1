package shoppingapp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


public class ShopApp {

    //Static Methods
    public static double calcTotal(ArrayList<Clothing> clothing){
        double total = 0;
        for(Clothing clothes : clothing){
            total += clothes.getPrice();
        }
        return total;
    }

    public static double employeePriceAfterDisc(Employee employee, Clothing article){
        double employeePrice = article.getPrice() - employee.getDiscount();

        return employeePrice;
        }


    public static boolean isAFit(Customer c1, Clothing clothes){
        if(c1.getSize() == clothes.getSize()){
            return true;
    }
        return false;
    }


    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> unsortedClothes) {
        Collections.sort(unsortedClothes, new PriceComparator());
        System.out.println("After sorting by price");
        for (Clothing article : unsortedClothes) {
            System.out.println(article.toString());
        }
    }


    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());
    }


    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothes){
        for(Discountable x : discountables){
            System.out.println(clothes.getPrice());
        }
    }

    //stretch goal
    public static void printDiscAmtOff(Employee employee, Clothing clothing){
        double employeeDiscount = employee.getDiscount();
        double priceOfDiscountedClothes = employeeDiscount * clothing.getPrice();



        System.out.println("The discounted amount off is: " + priceOfDiscountedClothes +"\nI DID THE FREAKIN STRETCH GOAL!!!");
    }



    //PSVM
    public static void main(String[] args) {
        Clothing shoes = new Clothing("sneakers", 30.00, '8');
        Clothing shirt = new Clothing("tank top", 25.00, '4');
        Clothing pants = new Clothing("jeans", 60.00, '4');

        Clothing hairTie = new Clothing("hair tie", 1, '0');
        Clothing jacket = new Clothing("jacket", 50.00, '5');
        Clothing sweater = new Clothing("cardigan", 25.00, '4');

        ArrayList<Clothing> managerCart = new ArrayList<>();
        managerCart.add(shoes); managerCart.add(shirt); managerCart.add(pants);
        Manager karen = new Manager("Karen", '7', managerCart, 0.25);

        ArrayList<Clothing> employeeCart = new ArrayList<>();
        employeeCart.add(shoes); employeeCart.add(shirt); employeeCart.add(pants);
        Employee jules = new Employee("Jules", '4', employeeCart, .10);
        HourlyEmployee jeff = new HourlyEmployee("Jeff", '5', employeeCart, .10);


        ArrayList<Clothing> springLooks = new ArrayList<>();
        springLooks.add(sweater); springLooks.add(jacket); springLooks.add(hairTie);



        //tests
        System.out.println(calcTotal(managerCart));
        System.out.println(isAFit(jules, shoes));
        System.out.println(employeePriceAfterDisc(jeff, shoes));
        System.out.println(employeePriceAfterDisc(jeff, shirt));
        System.out.println(employeePriceAfterDisc(karen, shoes));
        System.out.println(employeePriceAfterDisc(karen, shirt));
        sortAndPrintClothingByPrice(managerCart);
        printEmployeeName(jeff);
        printEmployeeName(jules);
        printEmployeeName(karen);

        for(Clothing article : springLooks){
            System.out.println(article);
        }

        printDiscAmtOff(karen, shoes);
        printDiscAmtOff(jules, shoes);


    }
}
//Users/julianajones/IdeaProjects/fakeshopapp/src/main/java/shoppingapp