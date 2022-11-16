// O(N) TC

public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int curr=i;
                int prev=map.get(A[i]);
                min=Math.min(min,curr-prev);
                map.put(A[i],i);
            }
            else {
                map.put(A[i],i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
