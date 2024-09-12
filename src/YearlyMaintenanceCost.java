import java.util.Scanner;

public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double maintenanceCostWinter;
        double maintenanceCostSpring;
        double maintenanceCostSummer;
        double maintenanceCostFall;
        double yearlyMaintenanceCost = 0;

        //output asking about maintenance cost, user inputs.
        System.out.println("What is your maintenance cost in the winter?");
        maintenanceCostWinter = scan.nextDouble();

        System.out.println("What is your maintenance cost in the spring?");
        maintenanceCostSpring = scan.nextDouble();

        System.out.println("What is your maintenance cost in the summer?");
        maintenanceCostSummer = scan.nextDouble();

        System.out.println("What is your maintenance cost in the fall?");
        maintenanceCostFall = scan.nextDouble();

        //adding to figure out the yearly cost
        yearlyMaintenanceCost = maintenanceCostWinter + maintenanceCostSpring +
                maintenanceCostSummer + maintenanceCostFall;

        //Output of the total cost which will be yearly cost
        System.out.println("Your yearly maintenance cost will be $" + yearlyMaintenanceCost + ".");
    }
}