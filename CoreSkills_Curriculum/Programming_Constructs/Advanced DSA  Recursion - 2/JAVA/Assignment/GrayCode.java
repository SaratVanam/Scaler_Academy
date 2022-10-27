// O(2^N)

public class Solution {
    public ArrayList<Integer> ans = new ArrayList<>();
    public int[] grayCode(int A) {
        solve(A);
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    public void solve(int a) {
        if(a==1){
            ans.add(0);
            ans.add(1);
            return;
        }

        solve(a-1);
        for(int i=ans.size()-1;i>=0;i--){
            ans.add(ans.get(i)+(int) Math.pow(2,a-1));
        }
    }
}
