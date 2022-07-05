package Com.BridgeLabz.Functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of Number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter a value of Number2:");
        int num2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
        System.out.println(distance);
    }

}
