import java.util.Scanner;

public class CoffeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner1.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner2.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner3.nextInt();
        int requiredWater = 200 * cups;
        int requiredMilk = 50 * cups;
        int requiredBeans = 15 * cups;
        int requiredTotal = requiredBeans + requiredMilk + requiredWater;
        int total = beans + water + milk;

        int availableCups = requiredTotal - total;
        System.out.println(availableCups);
        if(requiredMilk < milk && requiredBeans < beans && requiredWater < water ){
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
        /* Like literally what does my sister thinks she is? Huh?
        I  KNOW THE QUESTIONS BETTER THAN HER ! */







    }
}
