package com.sarat.Scaler;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(2,3,3));
        int a = -1%20;
        System.out.println(a);
    }

    public static int pow(int A, int B, int C){
        long x = (pow(A,B/2,C)%C + C)%C;
        if(B%2==0){
            return (int) ((x%C * x%C)%C + C)%C;
        }
        else
            return (int) ((x%C * x%C * A)%C + C)%C;
    }
}
