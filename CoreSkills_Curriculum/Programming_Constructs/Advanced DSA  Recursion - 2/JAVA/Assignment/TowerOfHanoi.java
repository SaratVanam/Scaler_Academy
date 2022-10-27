// O(2^N) TC

public class Solution {
    public ArrayList<Integer> ans = new ArrayList<>();
    public int[][] towerOfHanoi(int A) {
        tower(A,1,3,2);
        int n=ans.size()/3;
        int[][] res=new int[n][3];
        int x=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                res[i][j]=ans.get(x);
                x++;
            }
        }
        return res;
    }

    public void tower(int a, int s, int d, int m) {
        if(a==0){
            return;
        }
        tower(a-1,s,m,d);
        ans.add(a);
        ans.add(s);
        ans.add(d);
        tower(a-1,m,d,s);
    }
}
