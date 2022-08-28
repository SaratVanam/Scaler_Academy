// O(NlogN) TC

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        ArrayList<Integer> lis= new ArrayList<>();
        for(int i=0;i<A.length;i++){
            lis.add(A[i]);
        }
        Collections.sort(lis, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a=""+o1+o2;
                String b=""+o2+o1;
                if(a.compareTo(b)>0){
                    return -1;
                }
                else
                    return 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        int checko=0;
        for(int i= 0;i< lis.size();i++){
            if(lis.get(i)!=0){
                checko=1;
            }
            sb.append(lis.get(i));
        }
        if(checko==0){
            return "0";
        }
        return sb.toString();
    }
}
