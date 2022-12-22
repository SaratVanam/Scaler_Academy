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
 // O(N) TC O(H) SC
public class Solution {
    public int kthsmallest(TreeNode A, int B) {
        TreeNode prev=null;
        TreeNode curr=A;
        int x=1;
        int ans=0;
        Stack<TreeNode> s = new Stack<>();
        while(curr!=null || !s.isEmpty()){
            while(curr!=null){
                s.add(curr);
                curr=curr.left;
            }
            if(x==B){
                ans=s.peek().val;
                break;
            }
            x++;
            curr=s.pop();
            curr=curr.right;
        }
        return ans;
    }
}
