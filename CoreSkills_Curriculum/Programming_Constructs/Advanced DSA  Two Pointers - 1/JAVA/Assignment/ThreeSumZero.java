// O(NLogN)TC

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=A.size()-3;){
            int x=0-A.get(i);
            ArrayList<ArrayList<Integer>> check=findPair(A,i+1,x);
            for(int k=0;k<check.size();k++){
                outer.add(check.get(k));
            }
            int tmp = A.get(i);
            while(i<=A.size()-3 && A.get(i)==tmp){
                i++;
            }
        }
        return outer;

    }
    public ArrayList<ArrayList<Integer>> findPair(ArrayList<Integer> a, int i, int x) {
        int s=i;
        int e= a.size()-1;
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>();
        while(s<e){
            if(a.get(s)+a.get(e)==x){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(a.get(i-1));
                ans.add(a.get(s));
                ans.add(a.get(e));
                ans1.add(ans);
                int y=a.get(e);
                while(s<e && a.get(e)==y){
                    e--;
                }
                s++;
            }
            else if(a.get(s)+a.get(e)<x){
                s++;
            }
            else {
                e--;
            }
        }
        return ans1;
    }
}
