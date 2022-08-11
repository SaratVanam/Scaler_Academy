// O(N) TC

public class Solution {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                count++;
            }
        }
        int ans=0;
        int l=0;
        int r=0;
        boolean flag=false;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='0'){
                if(!flag){
                    flag=true;
                    for(int j=i-1;j>=0;j--){
                        if(A.charAt(j)=='1'){
                            l++;
                        }
                        else{
                            break;
                        }
                    }
                    for(int j=i+1;j<A.length();j++){
                        if(A.charAt(j)=='1'){
                            r++;
                        }
                        else{
                            break;
                        }
                    }
                    if(l+r<count){
                        ans=Math.max(ans,l+r+1);
                    }
                    else{
                        ans=Math.max(ans,l+r);
                    }
                }

                else{
                    l=r;
                    r=0;
                    for(int j=i+1;j<A.length();j++){
                        if(A.charAt(j)=='1'){
                            r++;
                        }
                        else{
                            break;
                        }
                    }
                    if(l+r<count){
                        ans=Math.max(ans,l+r+1);
                    }
                    else{
                        ans=Math.max(ans,l+r);
                    }
                }
            }
        }
        if(ans==0){
            return count;
        }
        return ans;
    }
}
