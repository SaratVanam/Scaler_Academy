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
    public int[] inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        TreeNode curr = A;
        Stack<TreeNode> s = new Stack<>();

        while(!s.isEmpty() || curr!=null){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.peek();
            s.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}
