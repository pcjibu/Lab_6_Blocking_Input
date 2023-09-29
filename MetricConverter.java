import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args)
    {
        double miles = 0.0;
        double meter = 0.0;
        double inches = 0.0;
        double feet = 0.0;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print(" What your value in meter?: ");
            if (in.hasNextDouble()) {
                meter = in.nextDouble();
                inches = (meter * 39.3701);
                miles = (meter * 0.00062137);
                feet = (meter * 32.8);
                System.out.println(" Your value in inches is " + inches +" in");
                System.out.println(" Your value in miles is " + miles +" mi");
                System.out.println(" Your value in feet is " + feet +" ft");
                done = true;
            } else {
                System.out.print("Try agin and input the right value");
                in.nextLine();

            }
        }while(!done);
    }
}
