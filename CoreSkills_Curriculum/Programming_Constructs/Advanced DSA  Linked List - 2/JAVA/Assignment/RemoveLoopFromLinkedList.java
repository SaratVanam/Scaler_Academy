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
        ListNode s=A;
        ListNode f=A;
        ListNode c=null;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                c=s;
                break;
            }
        }
        ListNode temp1=A;
        ListNode temp2 = c;
        ListNode prev=null;
        while(temp2!=temp1){
            prev=temp2;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        prev.next=null;
        return A;
    }
}
