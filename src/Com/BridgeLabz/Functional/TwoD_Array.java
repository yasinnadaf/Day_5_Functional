package Com.BridgeLabz.Functional;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();
        System.out.println("Enter array elements : ");
        int twoD[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n Data you entered : \n");
        for (int[] x : twoD) {
            for (int y : x) {

                System.out.print(y + "        ");
            }
            System.out.println();
        }
    }
}
