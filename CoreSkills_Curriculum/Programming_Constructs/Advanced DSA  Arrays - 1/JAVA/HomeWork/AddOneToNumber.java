// O(N) TC

public class Solution {
    public int[] plusOne(int[] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=0;
        for(int i=A.length-1;i>=0;i--){
            int x=A[i];
            if(i==A.length-1){
                x=A[i]+1;
            }
            x=x+carry;
            if(x>9){
                carry=1;
            }
            else{
                carry=0;
            }
            x=(x)%10;
            ans.add(x);
        }
        if(carry!=0){
            ans.add(1);
        }
        int check= ans.size()-1;
        while(ans.get(check)==0){
            check--;
        }
        int[] res = new int[check+1];
        int v=0;
        for(int i=check;i>=0;i--){
            res[v]=ans.get(i);
            v++;
        }
        return res;
    }
}
