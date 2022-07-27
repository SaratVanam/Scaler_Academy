import java.lang.*;
import java.util.*;
// O(1) solution

public class Summation_Game {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = a*(a+1)/2;
        System.out.println(ans);

    }
}

