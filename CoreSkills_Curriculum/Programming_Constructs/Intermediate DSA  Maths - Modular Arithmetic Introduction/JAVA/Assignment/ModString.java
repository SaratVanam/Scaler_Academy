// O(N) TC

public class Solution {
    public int findMod(String A, int B) {
        long ans=0;
        long exp=1;
        for(int i=A.length()-1;i>=0;i--){
            ans=ans+(((A.charAt(i)-'0')*exp)%B);
            exp=exp*10;
            ans%=B;
            exp%=B;
        }
        return (int) ans;
    }
}
