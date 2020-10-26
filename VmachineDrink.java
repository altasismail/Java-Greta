package ex;

import java.util.Scanner;

public class VmachineDrink {
    public static void main(String[] args) {
        System.out.println(" Want a drink? Give me some money! : ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        String[] menu = new String[] {"Coffee", "Chocolate" ,"Tea"};

        System.out.println(" Thank you for $" + money + " Choose your Drink :  " + menu[0] + " - " + menu[1] + " - " +  menu[2]);


        int hasMoney = 0; int count =0;
        while (scanner.hasNextInt()) {
            hasMoney = scanner.nextInt();
            money += hasMoney;
            count++;
            System.out.println(" Thank you for $" + money + " Choose your Drink :  " + menu[0] + " - " + menu[1] + " - " +  menu[2]);

        }

    }
}