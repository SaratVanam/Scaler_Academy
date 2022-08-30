//O(N) 

public class Solution {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        int check_=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=' '){
                check_=1;
            }
            if(check_==1 && A.charAt(i)!=' '){
                sb.append(A.charAt(i));
            }
            else if(check_==1 && A.charAt(i)==' '){
                check_=0;
                sb.append(A.charAt(i));
            }
        }
        if(sb.charAt(sb.length()-1)==' '){
            sb.deleteCharAt(sb.length()-1);
        }
        reverse(sb,0,sb.length()-1);
        int l=0;
        int r=0;
        while(r<sb.length()){
            if(sb.charAt(r)==' '){
                l++;
            }
            while(r<sb.length() && sb.charAt(r)!=' '){
                r++;
            }
            if(l<r){
                reverse(sb,l,r-1);
            }
            r++;
            l=r;
        }

        return sb.toString();
    }
    public void reverse(StringBuilder sb,int i, int j){
        while(i<=j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
