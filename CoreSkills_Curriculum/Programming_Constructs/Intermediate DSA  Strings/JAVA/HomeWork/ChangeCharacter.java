//O(NlogN) TC

public class Solution {
    public int solve(String A, int B) {
        int[] freq = new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int i=0;
        for(i=0;i<freq.length;i++){
            if(freq[i]<=B){
                B-=freq[i];
            }
            else{
                break;
            }
        }
        int ans=freq.length-i;
        if(ans==0){
            return 1;
        }
        return ans;
    }
}
