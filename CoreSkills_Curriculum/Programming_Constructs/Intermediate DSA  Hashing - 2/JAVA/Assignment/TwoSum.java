// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] twoSum(final int[] A, int B) {
        int[] ans= {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(B-A[i])){
                ans[0]=map.get(B-A[i])+1;
                ans[1]=i+1;
                return ans;
            }
            if(!map.containsKey(A[i])){
                map.put(A[i],i);
            }
        }
        if(ans[0]==-1){
            return new int[0];
        }
        return ans;
    }
}
