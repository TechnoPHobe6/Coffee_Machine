package machine;

// test update

import java.util.Scanner;

public class CoffeeMachine {
    static int waterLevel = 400;
    static int milkLevel = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int moneyLevel = 550;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, exit) :");
            String action = sc.nextLine();
            switch (action) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillCoffee();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "exit":
                    flag = false;
                    break;
                case "remaining":
                    machineLevels();
                    break;
            }
        }
    }

    public static void machineLevels() {
        System.out.println("The coffee machine has:");
        System.out.println(waterLevel + " of water");
        System.out.println(milkLevel + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(moneyLevel + " of money");
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = sc.nextLine();
        switch (selection) {
            case "1":
                if (waterLevel >= 250) {
                    waterLevel -= 250;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (coffeeBeans >= 16) {
                    coffeeBeans -= 16;
                } else {
                    System.out.println("Sorry, not enough coffee beans");
                    break;
                }
                if (disposableCups >= 1) {
                    disposableCups -= 1;
                } else {
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                moneyLevel += 4;
                break;
            case "2":
                if (waterLevel >= 350) {
                    waterLevel -= 350;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (milkLevel >= 75) {
                    milkLevel -= 75;
                } else {
                    System.out.println("Sorry, not enough milk!");
                }
                if (coffeeBeans >= 20) {
                    coffeeBeans -= 20;
                } else {
                    System.out.println("Sorry, not enough coffee beans");
                    break;
                }
                if (disposableCups >= 1) {
                    disposableCups -= 1;
                } else {
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                moneyLevel += 7;
                break;
            case "3":
                if (waterLevel >= 200) {
                    waterLevel -= 200;
                } else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (milkLevel >= 100) {
                    milkLevel -= 100;
                } else {
                    System.out.println("Sorry, not enough milk!");
                }
                if (coffeeBeans >= 12) {
                    coffeeBeans -= 12;
                } else {
                    System.out.println("Sorry, not enough coffee beans");
                    break;
                }
                if (disposableCups >= 1) {
                    disposableCups -= 1;
                } else {
                    System.out.println("Sorry, not enough cups");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                moneyLevel += 6;
                break;
            case "back":
                break;
        }
    }

    public static void fillCoffee() {
        System.out.println("Write how many ml of water do you want to add:");
        waterLevel += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkLevel += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += sc.nextInt();
    }

    public static void takeMoney() {
        System.out.printf("I gave you $%s%n", moneyLevel);
        moneyLevel = 0;
    }
}
