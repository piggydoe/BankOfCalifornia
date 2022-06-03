package me.geesy;

import me.geesy.app.ATM;
import me.geesy.app.BudgetCalculator;

import java.util.Scanner;

public class Main {

    /*
    Author: @OhGeesy's Son
    * */

    public static void main(String[] args) {
        ATM atm = new ATM();
        BudgetCalculator budgetCalculator = new BudgetCalculator();
        System.out.printf("\n 1. ATM.\n 2. Budget Calc.\n 3. Exit\n");
        System.out.print("Please Choose An Option: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if(option.equals("1")) {
            atm.run();
        } else if(option.equals("2")) {
            budgetCalculator.run();
        } else if(option.equals("3")) {
            System.exit(0);
        } else {
            System.out.println("Invalid Option");
            main(args);
        }
    }
}
