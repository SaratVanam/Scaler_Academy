// O(N) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }

        int ans=0;
        for(Integer value:set){
            if(set.contains(value-1)){
                continue;
            }
            else{
                int count=0;
                int check=value;
                while(set.contains(check)){
                    count++;
                    check++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
