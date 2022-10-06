import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int percent = scan.nextInt();
        scan.nextLine();

        TipCalculator calc = new TipCalculator(people, percent);
        double input = 0;
        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            input = scan.nextDouble();
            if (input != -1) {
                calc.addMeal(input);
            }
            scan.nextLine();
        }
            System.out.println("-------------------------------");
            System.out.println("Total bill before tip: $" + (formatter.format(calc.getTotalBillBeforeTip())));
            System.out.println("Total percentage: " + calc.getTipPercentage() + "%");
            System.out.println("Total tip: $" + (formatter.format(calc.tipAmount())));
            System.out.println("Total Bill with tip: $" + (formatter.format(calc.totalBill())));
            System.out.println("Per person cost before tip: $" + (formatter.format(calc.perPersonCostBeforeTip())));
            System.out.println("Tip per person: $" + (formatter.format(calc.perPersonTipAmount())));
            System.out.println("Total cost per person: $" + (formatter.format(calc.perPersonTotalCost())));
    }
}
