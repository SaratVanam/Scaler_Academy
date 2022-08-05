import java.lang.*;
import java.util.*;

//O(N) TC

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int b= sc.nextInt();
            System.out.println(search(arr,b));
        }
    }
    public static int search(int[] arr, int b){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                return 1;
            }
        }
        return 0;
    }
}