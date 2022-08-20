// O(N) TC

public class Solution {
    public int titleToNumber(String A) {
        long ans=0;
        long exp=1;
        for(int i=A.length()-1;i>=0;i--){
            ans+=((A.charAt(i)-'@')*exp);
            exp=exp*26;
        }
        return (int) ans;
    }
}
