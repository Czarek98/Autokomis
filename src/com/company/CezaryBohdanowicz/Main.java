package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;
import com.company.CezaryBohdanowicz.Human.Player;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mainSelect;
        int select;
        int clientIndex;
        int carIndex;
        int buySelect = -1;
        int numberOfTurns = 0;
        Scanner input = new Scanner(System.in);
        ListOfCars listOfCars = new ListOfCars();
        ListOfClients listOfClients = new ListOfClients();
        Player player = new Player("Cezary", "Bohdanowicz", 100000000.0);
        for (int i = 0; i < 5; i++) {
            listOfCars.listOfCars.add(new Car());
        }
        for (int i = 0; i < 5; i++) {
            player.myClients.add(new Client());
        }

        do {
            System.out.println("1) Show list of cars to buy ");
            System.out.println("2) Show " + player.firstname + " list of cars ");
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
                                System.out.println(listOfCars.listOfCars);
                                System.out.println(player.firstname + " money: " + player.gameCash);
                                System.out.print("Select car: ");
                                buySelect = input.nextInt() - 1;

                                try {
                                    player.Buy(buySelect, listOfCars);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                numberOfTurns++;
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
                        System.out.println(player.myCars);
                        System.out.println("1) Sell car");
                        System.out.println("2) Wash car");
                        System.out.println("3) Repair car");
                        System.out.println("4) Back");
                        select = input.nextInt();
                        switch (select) {
                            case 1:
                                System.out.print("Select car to sell: ");
                                carIndex = input.nextInt();
                                System.out.print("Select client: ");
                                clientIndex = input.nextInt();
                                System.out.println("sell function start here");
                                try {
                                    player.Sell(carIndex, clientIndex, listOfClients, listOfCars);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                                break;
                            case 2:
                                System.out.println("input, to select a car to wash");
                                select = input.nextInt();
                                System.out.println("wash function start here");
                                break;
                            case 3:
                                System.out.println("input, to select a car to repair");
                                select = input.nextInt();
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
                                System.out.println("You have: " + player.gameCash);
                                break;
                            case 2:
                                System.out.println("Player.getFirstname transaction history: ");
                                System.out.println("player.transactionHistory");
                                break;
                            case 3:
                                do {
                                    System.out.println("Select the type of ad");
                                    System.out.println("Your money: " + player.gameCash);
                                    System.out.println("1) Newspaper ad: 1000zł");
                                    System.out.println("2) Internet ad: 700zł");
                                    System.out.println("3) Back");
                                    select = input.nextInt();
                                    switch (select) {
                                        case 1:
                                            player.gameCash = player.gameCash - 1000.0;
                                            System.out.println("You choose newspaper ad. You gain 2 clients. Your money: " + player.gameCash);
                                            player.myClients.add(new Client());
                                            player.myClients.add(new Client());
                                            numberOfTurns++;
                                            break;
                                        case 2:
                                            player.gameCash = player.gameCash - 700.0;
                                            System.out.println("You choose internet ad. You gain 1 clients. Your money: " + player.gameCash);
                                            player.myClients.add(new Client());
                                            numberOfTurns++;
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
                                System.out.println(listOfClients.listOfClients);
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

