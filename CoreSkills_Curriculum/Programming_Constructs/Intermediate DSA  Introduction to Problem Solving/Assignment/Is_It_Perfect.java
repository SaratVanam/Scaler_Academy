import java.lang.*;
import java.util.*;

//O(Nsqrt(N)) time complexity

public class Is_It_Perfect {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int count=0;
            for(int b=1;b*b<=a;b++){
                if(a%b==0){
                    if(a/b==b){
                        count+=b;
                    }
                    else{
                        count+=b+a/b;
                    }
                }
            }
            count-=a;
            if(count==a){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
