// O(N) TC

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
         ArrayList<Interval> ans = new ArrayList<>();
        if(intervals.size()==0){
            ans.add(new Interval(newInterval.start,newInterval.end));
            return ans;
        }
        if(intervals.size()==0){
            ans.add(newInterval);
        }
        int s=newInterval.start;
        int e=newInterval.end;
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).end<s){
                ans.add(intervals.get(i));
            }
            else if(e<=intervals.get(i).start){
                ans.add(new Interval(s,e));
                while(i<intervals.size()){
                    ans.add(intervals.get(i));
                    i++;
                }
                return ans;
            }else{
                s=Math.min(s,intervals.get(i).start);
                e=Math.max(e,intervals.get(i).end);
            }
        }
        ans.add(new Interval(s,e));
        return ans;
    }
}
