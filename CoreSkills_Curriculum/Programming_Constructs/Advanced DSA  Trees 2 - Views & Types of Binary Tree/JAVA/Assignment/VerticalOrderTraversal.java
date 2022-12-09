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
        int val;
        TreeNode node;
        Pair(TreeNode x, int b){
            node=x;
            val=b;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(A,0));
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(A.val);
        map.put(0,temp);
        int max=0;
        int min=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                int distance=q.peek().val;
                TreeNode x = q.remove().node;
                if(x.left!=null){
                    q.add(new Pair(x.left,distance-1));
                    min=Math.min(min,distance-1);
                    max=Math.max(max,distance-1);
                    if(!map.containsKey(distance-1)){
                        ArrayList<Integer> temp1 = new ArrayList<>();
                        temp1.add(x.left.val);
                        map.put(distance-1,temp1);
                    }
                    else{
                        ArrayList<Integer> t=map.get(distance-1);
                        t.add(x.left.val);
                        map.put(distance-1,t);
                    }
                }
                if(x.right!=null){
                    q.add(new Pair(x.right,distance+1));
                    max=Math.max(max,distance+1);
                    min=Math.min(min,distance+1);
                    if(!map.containsKey(distance+1)){
                        ArrayList<Integer> temp1 = new ArrayList<>();
                        temp1.add(x.right.val);
                        map.put(distance+1,temp1);
                    }
                    else{
                        ArrayList<Integer> t=map.get(distance+1);
                        t.add(x.right.val);
                        map.put(distance+1,t);
                    }
                }
            }
        }
        for(int i=min;i<=max;i++){
            ArrayList<Integer> temp2 = map.get(i);
            ans.add(temp2);
        }
        return ans;
    }
}
