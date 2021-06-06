package base;
import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Cristiam Enciso

Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double tax_rate = 5.5;
        double tax;
        System.out.print("Enter the price of item 1: ");
        String item1 = in.nextLine();
        System.out.print("Enter quantity of item 1: " );
        String quantity1 = in.nextLine();
        System.out.print("Enter the price of item 2: ");
        String item2 = in.nextLine();
        System.out.print("Enter quantity of item 2: " );
        String quantity2 = in.nextLine();
        System.out.print("Enter the price of item 3: ");
        String item3 = in.nextLine();
        System.out.print("Enter quantity of item 3: " );
        String quantity3 = in.nextLine();
        double subtotal = (Double.parseDouble(item1) * Double.parseDouble(quantity1) + Double.parseDouble(item2) * Double.parseDouble(quantity2) + Double.parseDouble(item3) * Double.parseDouble(quantity3));
        tax = subtotal * (tax_rate/ 100);
        double total = subtotal + tax;
        System.out.printf("subtotal: $%.2f\n",subtotal);
        System.out.printf("Tax: $%.2f\n",tax);
        System.out.printf("Total: $%.2f\n",total);


    }
}
