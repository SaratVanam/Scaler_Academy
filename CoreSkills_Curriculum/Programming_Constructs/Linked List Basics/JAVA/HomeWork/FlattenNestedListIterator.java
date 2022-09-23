// public class Main {
//     public static void main(String[] args) {
        
//     }
    
//     // This is the interface that allows for creating nested lists.
//     // You should not implement it, or speculate about its implementation.
//     class NestedInteger {
        
//         NestedInteger(int x) {
//         }
        
//         // Return true if this NestedInteger holds a single integer, rather than a nested list.
//         boolean isInteger() {
//         }

//         // Return the single integer that this NestedInteger holds, if it holds a single integer.
//         // The result is 1e9 if this NestedInteger holds a nested list.
//         int getInteger() {
            
//         }

//         // Return the nested list that this NestedInteger holds, if it holds a nested list.
//         // The result is an empty ArrayList if this NestedInteger holds a single integer.
//         ArrayList<NestedInteger> getList() {
            
//         }
//     }

class NestedIterator {
        ArrayList<NestedInteger> ans;
        int i=0;
        NestedIterator itr=null;
        NestedIterator(ArrayList<NestedInteger> nestedList) {
            ans=nestedList;
        }

        int next() {
            NestedInteger a = ans.get(i);
            if(a.isInteger()){
                i++;
                return a.getInteger();
            }
            else{
                if(itr==null){
                    itr=new NestedIterator(a.getList());
                }
                if(itr.hasNext()){
                    return itr.next();
                }
                else{
                    i++;
                }
            }
            return 0;
        }

        boolean hasNext() {
            if(i<ans.size()){
                if(itr==null){
                    return true;
                }
                else{
                    return itr.hasNext();
                }
            }
            return false;
        }
    }