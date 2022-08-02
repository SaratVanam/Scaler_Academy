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
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int [] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int o=0;
            int e=0;
            for(int p=0;p<n;p++){
                if(arr[p]%2==0){
                    e++;
                }
                else
                    o++;
            }
            int[] odd=new int[o];
            int[] even=new int[e];
            int a=0,b=0;
            for(int k=0;k<n;k++){
                if(arr[k]%2==0){
                    even[a]=arr[k];
                    a++;
                }
                else{
                    odd[b]=arr[k];
                    b++;
                }
            }
            for(int j=0;j<odd.length;j++){
                System.out.print(odd[j]+" ");
            }
            System.out.println();
            for(int j=0;j< even.length;j++){
                System.out.print(even[j]+" ");
            }
            System.out.println();
        }
    }
}
