import java.lang.*;
import java.util.*;


// Can be solved in better way using Sieve of eratosthenes
public class Is_It_Prime {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int check=0;
        if(a==1){
            System.out.println("NO");
        }
        else{
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    check=1;
                    break;
                }
            }
            if(check==1){
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
    }
}



