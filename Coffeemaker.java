import java.util.Scanner; 

public class Coffeemaker { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("How much cups of coffee do you want"); 
        int cups = scanner.nextInt(); 
        for (int i = 1; i <= cups; i++) { 
            System.out.println("\nCup " + i + ":"); 
            System.out.println("Write the amount of teaspoons of coffee (must be greater than 0):"); 
            int coffeeTeaspoon = scanner.nextInt(); 
            if (coffeeTeaspoon <=0) { 
                System.out.println("Something went wrong. Number of teaspoons can't be negative");  
                return; 
            } 
            double price = 2.00; 
            if (coffeeTeaspoon > 1) { 
                price += (coffeeTeaspoon -1) * 0.50; 
            }
            System.out.println("Want milk (yes/no): ");
            String milks = scanner.next().toLowerCase(); 
            System.out.println("Want ice cream for $1 (yes/no): "); 
            String icecream = scanner.next().toLowerCase();
            double total = price; 
            if (icecream.equals("yes")) { 
                total += 1.00; 
            }
            System.out.printf("The cost for cup %d is: $%.2f\n", i, total); 

        }
        scanner.close(); 
        System.out.println("Thanks, come again");
    }

}