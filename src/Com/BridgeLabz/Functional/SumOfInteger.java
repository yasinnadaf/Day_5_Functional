package Com.BridgeLabz.Functional;
import java.util.Scanner;

 public class SumOfInteger {
    static void Sum(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scr.nextInt();
        int[] A = new int[N];
        int found=0;
        int count =0;

        for (int i=0;i<N;i++){
            A[i] = scr.nextInt();
        }
        for (int i=0;i<N-2;i++){
            for (int j=i+1;j<N-1;j++){
                for (int k=j+1;k<N;k++){
                    if ((A[i]+A[j]+A[k])==0){
                        System.out.println(A[i] +" " +A[j]+" "+A[k]);
                        found = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets are: "+ count);
        if(found == 0){
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Sum();
    }
 }
