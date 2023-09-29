import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        double height = 0.0;
        double width = 0.0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print(" What is the height of the Rectangle?: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input, Please enter a valid number.");
                scanner.next();
            }
            height = scanner.nextDouble();
        }while (height <= 0.0);
        do{
            System.out.print(" What is the width of the Rectangle?: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a valid number.");
                scanner.next();
            }
            width = scanner.nextDouble();
        }while (width <= 0.0);

        double area = height * width;
        double perimeter = height + height + width + width;
        double diagonal = Math.sqrt((height * height) + (width * width));
        System.out.println("your area is " + area);
        System.out.println("your perimeter is " + perimeter);
        System.out.println("your diagonal is " + diagonal);
    }
}
