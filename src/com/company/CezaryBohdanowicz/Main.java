package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Player;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mainSelect;
        int select;
        int numberOfTurns = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1) Show list of cars to buy ");
            System.out.println("2) Show " + "Player.getFirstname" + " list of cars ");
            System.out.println("3) Players account");
            System.out.println("4) Clients");
            System.out.println();
            System.out.println("Turn: " + numberOfTurns);
            System.out.println();
            System.out.println("0) Exit");
            System.out.println();
            System.out.print("Select: ");
            mainSelect = input.nextInt();

            switch (mainSelect) {

                case 0:
                    System.out.println("You lost your progress and end game.");
                    break;
                case 1:
                    do {
                        System.out.println("1) Show cars");
                        System.out.println("2) Back");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.println("List of cars");
                                System.out.println("Select car, input");
                                System.out.println("Display money");
                                System.out.println("When select here start function to buy a car and number of turns go up");
                                break;
                            case 2:
                                System.out.println("Previous menu: ");
                                break;
                            default:
                                System.out.println("Error, wrong number");
                        }
                    } while (select != 2);
                    break;
                case 2:
                    do {
                        System.out.println("show cars");
                        System.out.println("1) Sell car");
                        System.out.println("2) Wash car");
                        System.out.println("3) Repair car");
                        System.out.println("4) Back");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                select = input.nextInt();
                                System.out.println("input, to select a car to sell");
                                System.out.println("sell function start here");
                                break;
                            case 2:
                                select = input.nextInt();
                                System.out.println("input, to select a car to wash");
                                System.out.println("wash function start here");
                                break;
                            case 3:
                                select = input.nextInt();
                                System.out.println("input, to select a car to repair");
                                System.out.println("repair function start here");
                                break;
                            case 4:
                                System.out.println("Previous menu: ");
                                break;
                            default:
                                System.out.println("Error, wrong number");

                        }
                    } while (select != 4);
                    break;
                case 3:
                    do {
                        System.out.println("1) Check your bank account");
                        System.out.println("2) Transaction history");
                        System.out.println("3) Advertisements section");
                        System.out.println("4) Back");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.println("You have: " + "player.getCash())");
                                break;
                            case 2:
                                System.out.println("Player.getFirstname transaction history: ");
                                System.out.println("player.transactionHistory");
                                break;
                            case 3:
                                do {
                                    System.out.println("Select the type of ad");
                                    System.out.println("Your money: " + " player.getCash())");
                                    System.out.println("1) Newspaper ad");
                                    System.out.println("2) Internet ad");
                                    System.out.println("3) Back");
                                    select = input.nextInt();
                                    switch (select) {
                                        case 1:
                                            System.out.println("Function that add 2 potential clients, more cost");
                                            System.out.println("Increase number of turns");
                                            break;
                                        case 2:
                                            System.out.println("Function that add 1 potential clients, less cost");
                                            System.out.println("Increase number of turns");
                                            break;
                                        case 3:
                                            System.out.println("Back to previous menu: ");
                                            break;
                                        default:
                                            System.out.println("Error, wrong number");
                                    }
                                } while (select != 3);
                                break;
                            case 4:
                                System.out.println("back to previous menu");
                                break;
                            default:
                                System.out.println("Error, wrong number");
                        }
                    } while (select != 4);
                    break;
                case 4:
                    do {
                        System.out.println("1) Clients");
                        System.out.println("2) Back");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.println("Your potential customers: ");
                                System.out.println("clients list");
                                break;
                            case 2:
                                System.out.println("Previous menu: ");
                                break;

                            default:
                                System.out.println("Error, wrong number");
                        }
                    } while (select != 2);
                    break;

                default:
                    System.out.println("Error, wrong number");
            }
        } while (mainSelect != 0);


    }


}

