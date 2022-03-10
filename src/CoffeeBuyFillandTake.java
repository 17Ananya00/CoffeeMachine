import java.util.Scanner;

public class CoffeeBuyFillandTake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preWater = 400;
        int preMilk = 540;
        int preBeans = 120;
        int preCups = 9;
        int preMoney = 550;
        boolean exit = false;
        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("exit")) {
                exit = true;
            }
            switch (action) {
                case "take":
                    System.out.println("I gave you $" + preMoney);
                    preMoney = 0;
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String command = scanner.nextLine();
                    switch (command) {
                        case "1":
                            int espWater = 250;
                            int espBeans = 16;
                            int espMoney = 4;
                            int espCup = 1;
                            if (preWater > espWater && preBeans > espBeans && preCups > espCup) {
                                System.out.println("I have enough resources, making you a coffee!");
                                preWater = preWater - espWater;
                                preBeans = preBeans - espBeans;
                                preCups = preCups - 1;
                                preMoney = preMoney + espMoney;
                            } else {
                                if (preWater < espWater) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (espBeans > preBeans) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (espCup > preCups) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            }
                            break;
                        case "2":
                            int latWater = 350;
                            int latMilk = 75;
                            int latBeans = 20;
                            int latMoney = 7;
                            if (preWater > latWater && preMilk > latMilk && preBeans > latBeans && preCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                preWater = preWater - latWater;
                                preMilk = preMilk - latMilk;
                                preBeans = preBeans - latBeans;
                                preCups = preCups - 1;
                                preMoney = preMoney + latMoney;
                            } else {
                                if (preWater < latWater) {
                                    System.out.println("Sorry, not enough water!");
                                    preWater = preWater;
                                } else if (preMilk < latMilk) {
                                    System.out.println("Sorry, not enough milk!");
                                    preMilk = preMilk;
                                } else if (preBeans < latBeans) {
                                    System.out.println("Sorry, not enough beans!");
                                    preBeans = preBeans;
                                } else if (preCups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                    preBeans = preBeans;
                                }
                            }

                            break;

                        case "3":
                            int capWater = 200;
                            int capMilk = 100;
                            int capBeans = 12;
                            int capMoney = 6;
                            if (preWater > capWater && preMilk > capMilk && preBeans > capBeans && preCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (preWater < capWater) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (preMilk < capMilk) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (preBeans < capBeans) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (preCups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                            }
                            preWater = preWater - capWater;
                            preMilk = preMilk - capMilk;
                            preBeans = preBeans - capBeans;
                            preCups = preCups - 1;
                            preMoney = preMoney + capMoney;
                            break;
                        case "back":
                            if (command == "back") {
                                continue;
                            }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int addWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int addMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int addBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int addCups = scanner.nextInt();
                    preWater = preWater + addWater;
                    preMilk = preMilk + addMilk;
                    preBeans = preBeans + addBeans;
                    preCups = preCups + addCups;
                    scanner.nextLine();
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(preWater + " ml of water");
                    System.out.println(preMilk + " ml of milk");
                    System.out.println(preBeans + " g of beans");
                    System.out.println(preCups + " disposable cups");
                    System.out.println("$" + preMoney + " of money");
                    break;
            }

        }
    }
}
