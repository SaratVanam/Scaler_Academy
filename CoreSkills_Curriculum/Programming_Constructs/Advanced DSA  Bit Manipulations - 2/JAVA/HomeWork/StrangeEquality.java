// O(logN)

public class Solution {
    public int solve(int A) {
        int x=A;
        int a=1;
        int count=0;
        while(x>0){
            x=x>>a;
            count++;
        }
        int Y=1<<count;
        int X=0;
        for(int i=0;i<count;i++){
            if((A&(1<<i))==0){
                X+=1<<i;
            }
        }
        return X^Y;
    }
}
