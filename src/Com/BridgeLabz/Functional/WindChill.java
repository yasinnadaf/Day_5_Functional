package Com.BridgeLabz.Functional;


import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (temperature < 50 && windSpeed < 120 && windSpeed > 3) {
            double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
            System.out.println("Temperature = " + temperature + " Fahrenheit");
            System.out.println("Wind speed  = " + windSpeed + " miles/hr");
            System.out.println("Wind chill  = " + windChill + " Fahrenheit");
        } else {
            System.out.println("Please enter valid values.");
        }
    }
}
