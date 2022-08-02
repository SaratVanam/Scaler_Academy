import java.lang.*;
import java.util.*;

// O(1) time complexity

public class Multiplication_table {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output


        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" ="+" "+n*i);
        }
    }
}

