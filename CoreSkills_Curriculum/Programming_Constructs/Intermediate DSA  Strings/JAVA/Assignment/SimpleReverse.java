// O(N) TC

public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            sb.append(A.charAt(i));
        }
        int i=0;
        int j= sb.length()-1;
        while(i<=j){
            char temp= sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        
        return sb.toString();
    }
}
