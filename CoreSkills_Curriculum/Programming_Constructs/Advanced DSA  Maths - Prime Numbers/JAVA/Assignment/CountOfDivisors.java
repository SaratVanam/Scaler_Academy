// O(NLogN) TC

public class Solution {
    public int[] solve(int[] A) {
        int max=findMax(A);
        int[] cof = new int[max+1];
        Arrays.fill(cof,2);
        cof[1]=1;
        for(int i=2;i<=max;i++){
            for(int j=i*2;j<=max;j+=i){
                cof[j]++;
            }
        }
        int[] ans = new int[A.length];
        for(int i=0;i<A.length;i++){
            ans[i]=cof[A[i]];
        }
        return ans;
    }
    private int findMax(int[] a) {
        int max=a[0];
        for(int i=0;i<a.length;i++){
            max=Math.max(max,a[i]);
        }
        return max;
    }
}
