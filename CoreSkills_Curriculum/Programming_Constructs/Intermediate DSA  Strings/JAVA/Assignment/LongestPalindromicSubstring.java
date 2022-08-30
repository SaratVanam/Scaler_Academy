//O(N^2) TC

public class Solution {
    public String longestPalindrome(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            sb.append(A.charAt(i));
        }
        int l=0;
        int r=0;
        int length=1;
        int[] arr= new int[2];
        for(int i=0;i<sb.length();i++){
            arr =expand(sb,i,i);
            if(arr[1]>length){
                length=arr[1];
                l=arr[0];
                r=l+length-1;
            }
        }
        for(int i=0;i<sb.length()-1;i++){
            arr =expand(sb,i,i+1);
            if(arr[1]>length){
                length=arr[1];
                l=arr[0];
                r=l+length-1;
            }
        }
        StringBuilder ans1= new StringBuilder();
        for(int i=l;i<=r;i++){
            ans1.append(A.charAt(i));
        }
        return ans1.toString();
    }
    public int[] expand(StringBuilder sb,int i, int j){
        int l=i;
        int r=j;
        while(l>=0 && r<sb.length() && sb.charAt(l)==sb.charAt(r)){
            l--;
            r++;
        }
        return new int[] {l+1,r - l - 1};
    }
}
public class Solution {
    public String longestPalindrome(String A) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            sb.append(A.charAt(i));
        }
        int l=0;
        int r=0;
        int length=1;
        int[] arr= new int[2];
        for(int i=0;i<sb.length();i++){
            arr =expand(sb,i,i);
            if(arr[1]>length){
                length=arr[1];
                l=arr[0];
                r=l+length-1;
            }
        }
        for(int i=0;i<sb.length()-1;i++){
            arr =expand(sb,i,i+1);
            if(arr[1]>length){
                length=arr[1];
                l=arr[0];
                r=l+length-1;
            }
        }
        StringBuilder ans1= new StringBuilder();
        for(int i=l;i<=r;i++){
            ans1.append(A.charAt(i));
        }
        return ans1.toString();
    }
    public int[] expand(StringBuilder sb,int i, int j){
        int l=i;
        int r=j;
        while(l>=0 && r<sb.length() && sb.charAt(l)==sb.charAt(r)){
            l--;
            r++;
        }
        return new int[] {l+1,r - l - 1};
    }
}
