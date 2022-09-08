//O(N) TC

public class Solution {
    public int solve(String A) {
        return ispalin(A,0,A.length()-1);
    }
    public int ispalin(String A, int l, int r){
        if(l>r){
            return 1;
        }
        if(A.charAt(l)==A.charAt(r)){
            return ispalin(A,l+1,r-1);
        }
        else{
            return 0;
        }
    }
}
