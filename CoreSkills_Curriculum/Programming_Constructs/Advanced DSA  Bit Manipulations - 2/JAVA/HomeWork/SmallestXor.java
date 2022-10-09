// O(A+B)

public class Solution {
    public int solve(int A, int B) {
        int x=A;
        int count=0;
        while(x>0){
            x=x>>1;
            count++;
        }
        int ans=0;

        if(count<=B){
            for(int i=0;i<B;i++){
                ans+=1<<i;
            }
        }
        else{
            for(int i=count-1;i>=0;i--){
                if((A&(1<<i))!=0 && B>0 ){
                    ans+=1<<i;
                    B--;
                }
                else if((A&(1<<i))==0 && i+1<=B){
                    ans+=1<<i;
                    B--;
                }
            }
        }
        return ans;
    }
    
}
