// O(N) TC

import java.lang.*;
import java.util.*;
import java.util.Collections;
public class Solution {
    public void arrange(ArrayList<Integer> A) {
        int n =A.size();

        for(int i=0;i<n;i++){
            A.set(i,A.get(i)*n);
        }

        for(int i=0;i<n;i++){
            int index=A.get(i)/n;
            int newVal= A.get(index)/n;
            A.set(i,A.get(i)+newVal);
        }
        for(int i=0;i<n;i++){
            A.set(i,A.get(i)%n);
        }
    }
}
