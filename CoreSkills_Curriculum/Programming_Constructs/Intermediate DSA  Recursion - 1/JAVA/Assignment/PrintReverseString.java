//O(N) TC

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printRev(s,s.length()-1);
    }
    public static void printRev(String s,int i){
        if(i==0){
            System.out.print(s.charAt(0));
            return;
        }
        System.out.print(s.charAt(i));
        printRev(s,i-1);

    }
}

