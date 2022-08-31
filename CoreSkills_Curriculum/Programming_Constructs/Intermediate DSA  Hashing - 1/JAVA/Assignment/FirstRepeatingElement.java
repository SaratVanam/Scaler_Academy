//O(N) TC

public class Solution {
    public int solve(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int x=map.get(A[i]);
                if(x<index){
                    index=x;
                }
            }
            else{
                map.put(A[i],i);
            }
        }
        if(index==Integer.MAX_VALUE){
            return -1;
        }
        return A[index];
    }
}
