package Com.BridgeLabz.Functional;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4.0 * a * c;

        if (delta > 0.0) {
            double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (delta == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}