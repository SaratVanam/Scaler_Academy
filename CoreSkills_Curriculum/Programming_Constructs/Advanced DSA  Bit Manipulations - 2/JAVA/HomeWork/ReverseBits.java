// O(logN)

package com.sarat.Scaler;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(solve(0));
    }

    public static long solve(long A){
        long ans=0;
        int shift=31;
        while(A>0){
            if((A&1)==1){
                ans+=(1L<<shift);
            }
            shift--;
            A=A>>1;
        }
        return ans;
    }
}
