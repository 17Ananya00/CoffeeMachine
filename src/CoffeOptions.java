import java.util.Scanner;

public class CoffeOptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preWater = 400;
        int preMilk = 540;
        int preBeans = 120;
        int preCups = 9;
        int preMoney = 550;
        System.out.println("The coffee machine has:");
        System.out.println("400 ml of water");
        System.out.println("540 ml of milk");
        System.out.println("120 g of coffee beans");
        System.out.println("9 disposable cups");
        System.out.println("$550 of money");
        System.out.println("Write action (buy, fill, take):");
        String command = scanner.nextLine();
        switch (command) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int variety = scanner.nextInt();
                switch (variety) {
                    case 1:
                        int espWater = 250;
                        int espBeans = 16;
                        int espMoney = 4;
                        int espAfterWater = preWater - espWater;
                        int espAfterBeans = preBeans - espBeans;
                        int espAfterCups = preCups - 1;
                        int espAfterMoney = preMoney + espMoney;
                        System.out.println("The coffee machine has:");
                        System.out.println(espAfterWater + " ml of water");
                        System.out.println(preMilk + " ml of milk ");
                        System.out.println(espAfterBeans + " g of coffee beans");
                        System.out.println(espAfterCups + " disposable cups");
                        System.out.println("$" + espAfterMoney + " of money");
                        break;
                    case 2:
                        int latWater = 350;
                        int latMilk = 75;
                        int latBeans = 20;
                        int latMoney = 7;
                        int latAfterWater = preWater - latWater;
                        int latAfterMilk = preMilk - latMilk;
                        int latAfterBeans = preBeans - latBeans;
                        int latAfterCups = preCups - 1;
                        int latAfterMoney = preMoney + latMoney;
                        System.out.println("The coffee machine has:");
                        System.out.println(latAfterWater + " ml of water");
                        System.out.println(latAfterMilk + " ml of milk");
                        System.out.println(latAfterBeans + " g of beans");
                        System.out.println(latAfterCups + " disposable cups");
                        System.out.println("$" + latAfterMoney + " of money");
                        break;

                    case 3:
                        int capAfterWater = preWater - 200;
                        int capAfterMilk = preMilk - 100;
                        int capAfterBeans = preBeans - 12;
                        int capAfterCups = preCups - 1;
                        int capAfterMoney = preMoney + 6;

                        System.out.println("The coffee machine has:");
                        System.out.println(capAfterWater + " ml of water");
                        System.out.println(capAfterMilk + " ml of milk");
                        System.out.println(capAfterBeans + " g of beans");
                        System.out.println(capAfterCups + " disposable cups");
                        System.out.println("$" + capAfterMoney + " of money");
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add: ");
                int waterAdded = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                int milkAdded = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int beansAdded = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int cupsAdded = scanner.nextInt();
                int water = waterAdded + preWater;
                int milk = milkAdded + preMilk;
                int beans = beansAdded + preBeans;
                int cups = preCups + cupsAdded;
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(beans + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$550 of money");
                break;
            case "take":
                System.out.println("I gave you $550");
                System.out.println("The coffee machine has:");
                System.out.println("400 ml of water");
                System.out.println("540 ml of milk");
                System.out.println("120 g of coffee beans");
                System.out.println("9 disposable cups");
                System.out.println("$0 of money");


        }
    }
}
