import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=0;i<N;i++){
            int k=0;
            for(int j=0;j<2*N;j++){
                if(i+j>=N && k<i*2){
                    System.out.print(" ");
                    k++;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i=N-1;i>=0;i--){
            int k=0;
            for(int j=0;j<2*N;j++){
                if(i+j>=N && k<i*2){
                    System.out.print(" ");
                    k++;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}