package lab4;

import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        String menu = "Pizza, Burger, Pasta, Sandwich, Momos, French Fries, Garlic Bread, Noodles, Spring Rolls, Cold Coffee";

        // 1.
        System.out.println("Menu is: "+menu);

        // 2. 
        System.out.println("====================================");
        System.out.println(menu.toLowerCase());
        System.out.println(menu.toUpperCase());

        //3.
        System.out.println("======================================");
        menu=menu+",Fries";
        System.out.println("Updated menu: "+menu);

        //4
        System.out.println("=======================================");
        System.out.println("Position of Pasta : "+ menu.indexOf("Pasta"));

        //5
        System.out.println("========================================");
        menu = menu.replace("Burger", "Wrap");
        System.out.println(menu);

        //6
        System.out.println(menu.substring(menu.indexOf("Sandwich"),menu.indexOf("Sandwich")+8));

        //7
        System.out.println("===========================================");
        System.out.println(menu.substring(0, 5));

        //8
        System.out.println("============================================");
        for(String str: menu.split(",")){
            System.out.println(str);
        }

        // 9
        System.out.println("===============================================");
        System.out.println("Pizza" == "pizza");
        System.out.println("Pizza".equalsIgnoreCase("pizza"));


        //10
        System.out.println("================================================");
        System.out.println("Pizza".compareTo("Pasta"));

        //11
        System.out.println("=======================================");
        int price = 299;
        System.out.println(String.valueOf(price));

        //12
        System.out.println("Total Count: "+menu.split(",").length);

        //13
        Scanner sc = new Scanner((System.in));
        String order = sc.next();
        String msg = menu.contains(order)?"Order present in menu":"Order Not present in menu";
        System.out.println(msg);
        sc.close();

        //14
        System.out.println(menu);
    }
}
