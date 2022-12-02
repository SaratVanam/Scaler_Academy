// O(A*N) TC

package com.sarat.Scaler;

import java.util.LinkedList;
import java.util.Queue;

public class Perfectnumbers {
    public String solve(int A){
        int c=0;
        Queue<String > q = new LinkedList<>();
        q.add("11");
        q.add("22");
        while(c<A-1){
            String a=q.remove();
            q.add(a.substring(0,a.length()/2)+"11"+a.substring(a.length()/2));
            q.add(a.substring(0,a.length()/2)+"22"+a.substring(a.length()/2));
            c++;
        }
        return q.peek();
    }
}
