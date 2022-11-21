/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

 // O(N) TC
public class Solution {
    public ListNode solve(ListNode A) {
        if(A==null){
            return null;
        }
        int count=0;
        ListNode temp = A;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1){
            return null;
        }
        int mid=count/2;
        temp=A;
        count=1;
        while(count<mid){
            count++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return A;
    }
}
