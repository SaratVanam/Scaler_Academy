// O(N^2)

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            int b=sc.nextInt();
            int max,step,lcm=0;
            if(a > b){
                max = step = a;
            }
            else{
                max = step = b;
            }

            while(a!= 0) {
                if(max % a == 0 && max % b == 0) {
                    lcm = max;
                    break;
                }
                max += step;
            }
            System.out.println(lcm);
        }
    }
}