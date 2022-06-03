package me.geesy.app;

import me.geesy.util.IO;

import java.io.IOException;
import java.util.Scanner;

public class ATM {

    public int userBal = 0;

    public void run() {
        System.out.printf("\n 1. List Balances.\n 2. Add Balance.\n 3. Withdrawl Balance.\n 4. Exit\n");
        System.out.print("Please Choose An Option: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if(option.equals("1")) {
            listBalances();
        } else if(option.equals("2")) {
            addBalance();
        } else if(option.equals("3")) {
            removeBalance();

        } else if(option.equals("4")) {
            exit();
        } else {
            System.out.println("Invalid Option");
            run();
        }
    }
    public void listBalances(){
        System.out.println("Your Balance is: ");
        try{
            IO.readFile("balance.txt");
        } catch(IOException e){
            System.out.println("Error: " + e);
        }
        run();
    }

    public void addBalance(){
        System.out.print("Enter Amount to Add: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        userBal += amount;
        System.out.println("Your Balance is: " + userBal);
        try{
            IO.writeStringToFile("balance.txt", String.valueOf(userBal));
        } catch (IOException e){
            System.out.println("Error writing to file");
        }
        run();
    }

    public void removeBalance() {
        System.out.print("Enter Amount to Remove: ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        if(userBal <= amount){
            System.out.println("You cannot withdrawl, you have no money");
        } else {
            userBal -= amount;
            try{
                IO.writeStringToFile("balance.txt", String.valueOf(userBal));
            } catch (IOException e){
                System.out.println("Error writing to file");
            }
        }

        System.out.println("Your Balance is: " + userBal);
        run();
    }

    public void exit(){
        System.out.println("Thank you for choosing Geesy's ATM");
        System.exit(0);
    }

}
