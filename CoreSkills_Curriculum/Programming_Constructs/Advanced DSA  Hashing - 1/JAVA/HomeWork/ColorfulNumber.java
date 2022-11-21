// O(N) TC

public class Solution {
    public int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        int len= String.valueOf(A).length();
        int[] arr = new int[len];
        int x=arr.length-1;
        while(A>0){
            arr[x]=A%10;
            A=A/10;
            x--;
        }
        for(int i=0;i<arr.length;i++){
            int prod=1;
            for(int j=i;j<arr.length;j++){
                prod=prod*arr[j];
                if(set.contains(prod)){
                    return 0;
                }
                else{
                    set.add(prod);
                }
            }
        }
        return 1;
    }
}
