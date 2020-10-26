package ex;

import java.util.Scanner;

public class MachineDrinkII {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Drinks[] drinksInTheMachine= new Drinks[4];
        drinksInTheMachine[0] = Drinks.NO_DRINK;
        drinksInTheMachine[1] = Drinks.COFFEE;
        drinksInTheMachine[2] = Drinks.CHOCOLATE;
        drinksInTheMachine[3] = Drinks.TEA;

        System.out.println("Welcome! What would you like to drink? : " + drinksInTheMachine[1] + " - " + drinksInTheMachine[2] + " - " + drinksInTheMachine[3] + " - " + drinksInTheMachine[0] + " to Return Money ");

        String askDrink = ent.nextLine();
        System.out.println("Would you like to drink " + askDrink + "?");



    }

    public Boolean confirm = new Boolean(String.valueOf(System.in));



    private static void askMoney() {

    }

}
