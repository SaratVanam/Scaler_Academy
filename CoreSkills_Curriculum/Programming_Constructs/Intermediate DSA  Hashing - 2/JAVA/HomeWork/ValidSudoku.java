//O(9*9) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();
        HashSet<Character> s3 = new HashSet<>();
        for(int i=0;i<9;i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j=0;j<9;j++){
                if(row.contains(A[i].charAt(j)) && A[i].charAt(j)!='.' || A[i].charAt(j)>'9' && A[i].charAt(j)!='.' || A[i].charAt(j)<'0' && A[i].charAt(j)!='.'){
                    return 0;
                }
                else if(!row.contains(A[i].charAt(j))){
                    row.add(A[i].charAt(j));
                }
                if(col.contains(A[j].charAt(i)) && A[j].charAt(i)!='.' || A[j].charAt(i)>'9' && A[j].charAt(i)!='.' || A[j].charAt(i)<'0' && A[j].charAt(i)!='.'){
                    return 0;
                }
                else if(!col.contains(A[j].charAt(i))){
                    col.add(A[j].charAt(i));
                }
                if(j<3){
                    if(s1.contains(A[i].charAt(j)) && A[i].charAt(j)!='.' || A[i].charAt(j)>'9' && A[i].charAt(j)!='.' || A[i].charAt(j)<'0' && A[i].charAt(j)!='.'){
                        return 0;
                    }
                    else if(!s1.contains(A[i].charAt(j))){
                        s1.add(A[i].charAt(j));
                    }
                }
                else if(j>2 && j<6){
                    if(s2.contains(A[i].charAt(j)) && A[i].charAt(j)!='.' || A[i].charAt(j)>'9' && A[i].charAt(j)!='.' || A[i].charAt(j)<'0' && A[i].charAt(j)!='.'){
                        return 0;
                    }
                    else if(!s2.contains(A[i].charAt(j))){
                        s2.add(A[i].charAt(j));
                    }
                }
                else if(j>5){
                    if(s3.contains(A[i].charAt(j)) && A[i].charAt(j)!='.' || A[i].charAt(j)>'9' && A[i].charAt(j)!='.' || A[i].charAt(j)<'0' && A[i].charAt(j)!='.'){
                        return 0;
                    }
                    else if(!s2.contains(A[i].charAt(j))){
                        s3.add(A[i].charAt(j));
                    }
                }
            }
            if(i==2 || i==5){
                s1.clear();
                s2.clear();
                s3.clear();
            }
        }
        return 1;
    }
}
