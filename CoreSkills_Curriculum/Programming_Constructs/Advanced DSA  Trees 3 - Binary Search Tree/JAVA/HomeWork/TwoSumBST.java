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
    public int t2Sum(TreeNode A, int B) {
        Stack<TreeNode> max = new Stack<>();
        Stack<TreeNode> min = new Stack<>();
        TreeNode left=A;
        TreeNode right= A;
        while(left!=null){
            min.push(left);
            left=left.left;
        }
        while(right!=null){
            max.push(right);
            right=right.right;
        }
        left=min.pop();
        right=max.pop();
        while(left!=null && right!=null && left!=right){
            if(left.val+right.val>B){
                right=right.left;
                while(right!=null){
                    max.push(right);
                    right=right.right;
                }
                right=max.pop();
            }
            else if(left.val+right.val<B){
                left=left.right;
                while(left!=null){
                    min.push(left);
                    left=left.left;
                }
                left=min.pop();
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
