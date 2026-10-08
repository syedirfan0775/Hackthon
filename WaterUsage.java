import java.util.Scanner;

public class WaterUsage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of family members: ");
        int n = sc.nextInt();

        System.out.print("Enter Water consumed in litres: ");
        double l = sc.nextDouble();

        System.out.print("Enter House number: ");
        int h = sc.nextInt();

        System.out.print("Enter Water usage status: ");
        char c = sc.next().charAt(0);

        System.out.println("\nHousehold Details:");
        System.out.println("Number of family members: " + n);
        System.out.println("Water consumed in litres: " + l);
        System.out.println("House number: " + h);
        System.out.println("Water usage status: " + c);
    }
}