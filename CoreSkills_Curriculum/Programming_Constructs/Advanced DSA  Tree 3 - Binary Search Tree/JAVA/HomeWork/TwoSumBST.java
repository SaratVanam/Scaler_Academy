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

 //O(N) TC
public class Solution {
    public int t2Sum(TreeNode A, int B) {
        HashSet<Integer> set = new HashSet<>();
        if(check(A,B,set)){
            return 1;
        }
        return 0;
    }

    public boolean check(TreeNode A, int B, HashSet<Integer> set){
        if(A==null){
            return false;
        }
        if(!set.contains(B-A.val)){
            set.add(A.val);
        }
        else{
            return true;
        }
        if(!check(A.left,B,set)){
            if(check(A.right,B,set)){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return true;
        }
    }
}
