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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        if(A == null) {
            return result;
        }

        TreeNode current = A;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                result.add(current.val);
                current = current.right;
            }

            current = stack.pop();
            current = current.left;
        }

        Collections.reverse(result);
        return result;
    }
}
