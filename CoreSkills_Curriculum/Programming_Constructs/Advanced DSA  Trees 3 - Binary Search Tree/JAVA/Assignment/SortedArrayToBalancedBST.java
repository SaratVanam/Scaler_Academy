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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        return construct(A,0,A.length-1);
    }

    public TreeNode construct(int[] A, int l ,int r){
        if(l==r){
            return new TreeNode(A[l]);
        }
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode x = new TreeNode(A[mid]);
        TreeNode left=construct(A,l,mid-1);
        TreeNode right = construct(A,mid+1,r);
        x.left= left;
        x.right=right;
        return x;
    }
}
