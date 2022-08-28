//O(N) TC

public class Solution {
    public String longestCommonPrefix(String[] A) {
        if(A.length==0){
            return "";
        }
        if(A.length==1){
            return A[0];
        }
        StringBuilder sb = new StringBuilder();
        int las=Integer.MAX_VALUE;
        for(int i=0;i<A.length-1;i++){
            int len=Math.min(A[i].length(),A[i+1].length());
            int j;
            for(j=0;j<len;j++){
                if(A[i].charAt(j)!=A[i+1].charAt(j)){
                    break;
                }
            }
            las=Math.min(las,j-1);
        }
        if(las==-1)
            return "";
        for(int i=0;i<=las;i++){
            sb.append(A[0].charAt(i));
        }
        return sb.toString();
    }
}
