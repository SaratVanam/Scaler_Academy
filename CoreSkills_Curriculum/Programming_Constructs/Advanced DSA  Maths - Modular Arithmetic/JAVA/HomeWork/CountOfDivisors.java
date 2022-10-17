// O(N) TC

public class Solution {
    public int[] solve(int[] A) {
        int[] ans = new int[A.length];

        for(int i=0;i<A.length;i++){
            ans[i]=find(A[i]);
        }
        return ans;
    }

    public int find(int a){
        int count=0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                if(i==a/i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
}
