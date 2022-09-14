//O(NlogN) TC

public class Solution {
	public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> ans = new ArrayList<>();
         return compute(a,ans);
	}

    public ArrayList<Integer> compute(int a, ArrayList<Integer> ans){
        if(a==1){
            ans.add(0);
            ans.add(1);
            return ans;
        }
        compute(a-1,ans);
        for(int i=ans.size()-1;i>=0;i--){
            ans.add(ans.get(i)|(1<<a-1));
        }
        return ans;
    }
}
