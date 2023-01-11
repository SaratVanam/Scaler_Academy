/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
 // O(N) TC
public class Solution {
    public int solve(TreeNode A) {
        HashMap<Long, Integer> map = new HashMap<>();
        long sum= sum(A,map);
        if(sum==0){
            if(map.get(sum)>0){
                return 1;
            }
            else return 0;
        }
        if(sum%2==0 && map.containsKey(sum/2)){
            return 1;
        }
        return 0;
    }



    public long sum(TreeNode A, HashMap<Long, Integer> map){
        if(A==null){
            return 0;
        }
        long l=sum(A.left,map);
        long r=sum(A.right,map);
        long sum=l+r+A.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}
