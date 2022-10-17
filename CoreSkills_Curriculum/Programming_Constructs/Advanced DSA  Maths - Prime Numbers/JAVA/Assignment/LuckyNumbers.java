// O(NLogN) TC

public class Solution {
    public int solve(int A) {
        int[] check = new int[A+1];
        int[] ans = new int[A+1];
        for(int i=2;i<=A;i++){
            check[i]=1;
        }
        int count=0;
        for(int i=2;i<=A;i++){
            if(check[i]==1){
                for(long j=i*2;j<=A;j+=i){
                    check[(int)j]=0;
                    ans[(int)j]++;
                }
            }
        }
        for(int i=0;i<=A;i++){
            if(ans[i]==2){
                count++;
            }
        }
        return count;
    }
}
