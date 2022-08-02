import java.lang.*;
import java.util.*;

// O(N) time complexity as the inner loop will run for max of 10 times as the integer can have a max of 10 digits.

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int number=0;
            if(i<10){
                number+=i*i*i;
            }
            else if(i<100){
                int b =i;
                while(b>0){
                    int x=b%10;
                    number+=x*x*x;
                    b=b/10;
                }
            }
            else{
                int b =i;
                while(b>0){
                    int x=b%10;
                    number+=x*x*x;
                    b=b/10;
                }
            }
            if(number==i){
                System.out.println(i);
            }
        }
    }
}
