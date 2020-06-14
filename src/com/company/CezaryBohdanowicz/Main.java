package com.company.CezaryBohdanowicz;

import java.awt.*;
import java.util.Scanner;

public class Main {
    static boolean exit;

    public static void main(String[] args) {


        Menu menu = new Menu();
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getMenuChoice();
            performAction(choice);
        }

    }

        private static void printHeader() {
            System.out.println("+-----------------------------------+");
            System.out.println("|          Car Dealership           |");
            System.out.println("|              GAME                 |");
            System.out.println("+-----------------------------------+");
        }

        private static void printMenu() {
            displayHeader("Please make a selection");
            System.out.println("1) List of car to buy");
            System.out.println("2) Your list of car");
            System.out.println("3) Your account balance");
            System.out.println("4) Repair your car");
            System.out.println("5) Number of transactions");
            System.out.println("6) Price list");
            System.out.println("0) Exit");
        }

        private static int getMenuChoice() {
            Scanner keyboard = new Scanner(System.in);
            int choice = -1;
            do {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(keyboard.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid selection. Numbers only please.");
                }
                if (choice < 0 || choice > 4) {
                    System.out.println("Choice outside of range. Please chose again.");
                }
            } while (choice < 0 || choice > 4);
            return choice;
        }

        private static void performAction(int choice) {
            switch (choice) {
                case 0:
                    System.out.println("Thank you for using our application.");
                    System.exit(0);
                    break;
                case 1:
                    //function
                    break;
                case 2:
                    //function
                    break;
                case 3:
                    //function
                    break;
                case 4:
                    //function
                    break;
                default:
                    System.out.println("Unknown error has occured.");
            }
        }

        private static void displayHeader(String message){
            System.out.println();
            int width = message.length() + 6;
            StringBuilder sb = new StringBuilder();
            sb.append("+");
            for(int i = 0; i < width; ++i){
                sb.append("-");
            }
            sb.append("+");
            System.out.println(sb.toString());
            System.out.println("|   " + message + "   |");
            System.out.println(sb.toString());
        }

    }

