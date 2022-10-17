// O(N) TC

public class Solution {
    public int solve(int[] A, int B) {
        int[] mod = new int[B];
        for(int i=0;i<A.length;i++){
            mod[A[i]%B]++;
        }
        int modulo=1000000007;
        long ans=(1L*mod[0]*(mod[0]-1))/2L;
        ans%=modulo;
        int l=1;
        int r=mod.length-1;
        while(l<r){
            ans+=(mod[l]%modulo*mod[r]%modulo)%modulo;
            l++;
            r--;
        }
        if(l==r){
            ans+=(1L*mod[l]*(mod[l]-1))/2L;
            ans%=modulo;
        }
        return (int)((ans%modulo+modulo)%modulo);
    }
}
