package me.geesy.app;

import me.geesy.util.Maths;

import java.util.Scanner;

public class BudgetCalculator {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Welcome to the Budget Calculator");
        System.out.println("Remember, if one doesnt apply enter 0");
        System.out.print("Please enter your monthly Income: ");
        float income = scanner.nextFloat();

        System.out.print("Please enter your monthly rent: ");
        float rent = scanner.nextFloat();

        System.out.print("Please enter your monthly groceries bill: ");
        float food = scanner.nextFloat();

        System.out.print("Please enter your monthly gas bill: ");
        float gas = scanner.nextFloat();

        System.out.print("Please enter your monthly car insurance bill: ");
        float carInsurance = scanner.nextFloat();

        System.out.print("Please enter your monthly health insurance bill: ");
        float healthInsurance = scanner.nextFloat();

        System.out.print("Please enter your monthly car payment (if applies): ");
        float carPayment = scanner.nextFloat();

        float budget = income - rent - food - gas;
        System.out.println("You spend: " + budget + "$ per month");
        System.out.println("Other Expenses\n");

        System.out.print("Please enter your monthly investment ammount (if applies, as a percentage): ");
        float stock = scanner.nextFloat();

        System.out.print("Please enter your monthly self-care ammount (if applies, as a percentage): ");
        float self = scanner.nextFloat();

        System.out.print("Please enter your monthly partner/significant other ammount (if applies, as a percentage): ");
        float partner = scanner.nextFloat();

        System.out.print("Please enter your monthly savings amount ammount (if applies, as a percentage): ");
        float savings = scanner.nextFloat();

        System.out.println("\nYour monthly expenses are: " + (rent + food + gas + carInsurance + healthInsurance + carPayment + stock + self + partner + savings) + "$");




    }
}
