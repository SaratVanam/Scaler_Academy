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
    class Pair{
        TreeNode node;
        int min;
        int max;
        int size;
        Pair(TreeNode A, int s, int m, int ma){
            node=A;
            size=s;
            min=m;
            max=ma;
        }
    }
    public int solve(TreeNode A) {
        int ans=check(A,0,Integer.MAX_VALUE,Integer.MIN_VALUE).size;
        return ans;
    }

    public Pair check(TreeNode A, int size, int min, int max){
        if(A==null){
            return new Pair(A,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Pair x=check(A.left,size,min,max);
        Pair y=check(A.right,size,min,max);
        if(A.val>x.max && A.val<y.min){
            return new Pair(A,x.size+y.size+1,Math.min(A.val,Math.min(x.min,y.min)),Math.max(A.val, Math.max(x.max,y.max)));
        }
        return new Pair(A,Math.max(x.size,y.size),Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
