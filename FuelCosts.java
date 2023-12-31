import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        double totalGallons = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(" What is the number of gallons in the car?: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input, Please enter a valid number.");
                scanner.next();
            }
            totalGallons = scanner.nextDouble();
        } while (totalGallons <= 0.0);
        do {
            System.out.print(" What is your cars fuel effeciency: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a valid number.");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0.0);
        do {
            System.out.print(" What is the price of the gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a valid number.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0.0);

        double costPer100Miles = (100.0 / fuelEfficiency) * pricePerGallon;
        double distanceCanGo = totalGallons * fuelEfficiency;
        System.out.print(" The cost of 100 miles would be " + costPer100Miles);
        System.out.print(" The distance you can go is " + distanceCanGo);
    }

}
