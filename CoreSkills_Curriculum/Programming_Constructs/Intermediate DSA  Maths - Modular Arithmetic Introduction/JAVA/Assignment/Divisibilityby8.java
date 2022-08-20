// O(N) TC

public class Solution {
    public int solve(String A) {
        long exp=1;
        long ans=0;
        if(A.length()<4){
            for(int i=A.length()-1;i>=0;i--){
                ans+=((A.charAt(i)-'0')*exp);
                exp=exp*10;
            }
        }
        else {
            for(int i=A.length()-1;i>=A.length()-3;i--){
                ans+=((A.charAt(i)-'0')*exp);
                exp=exp*10;
            }
        }
        if(ans%8==0){
            return 1;
        }
        return 0;
    }
}
