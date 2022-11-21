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
    public ListNode reverseList(ListNode A) {
        ListNode curr = A;
        ListNode prev = null;
        ListNode currNext = null;
        while(curr!=null){
            currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        A=prev;
        return A;
    }
}
