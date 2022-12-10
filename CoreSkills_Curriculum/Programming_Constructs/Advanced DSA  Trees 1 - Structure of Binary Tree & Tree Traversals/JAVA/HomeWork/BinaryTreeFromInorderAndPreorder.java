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
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        TreeNode x=construct(A,B,0,A.size()-1,0,B.size()-1);
        return x;
    }

    public TreeNode construct(ArrayList<Integer> A,ArrayList<Integer> B, int ps,int  pe,int is,int ie){
        if(ps>pe){
            return null;
        }
        int croot=A.get(ps);
        TreeNode x = new TreeNode(croot);
        int index=-1;
        for(int i=is;i<=ie;i++){
            if(B.get(i)==croot){
                index=i;
                break;
            }
        }
        int l=index-is;
        x.left=construct(A,B,ps+1,ps+l,is,index-1);
        x.right=construct(A,B,ps+l+1,pe,index+1,ie);
        return x;
    }
}
