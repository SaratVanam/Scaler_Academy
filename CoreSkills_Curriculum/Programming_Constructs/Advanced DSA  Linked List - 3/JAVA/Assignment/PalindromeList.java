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
    public int lPalin(ListNode A) {
        if(A==null || A.next==null){
            return 1;
        }
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode midNext=slow.next;
        slow.next=null;
        ListNode B=reverseList(midNext);
        while(B!=null){
            if(A.val!=B.val){
                return 0;
            }
            A=A.next;
            B=B.next;
        }
        return 1;
    }
    public ListNode reverseList(ListNode A){
        if(A==null || A.next==null){
            return A;
        }

        ListNode curr=A;
        ListNode currNext=null;
        ListNode prev=null;
        while(curr!=null){
            currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        return prev;
    }
}
