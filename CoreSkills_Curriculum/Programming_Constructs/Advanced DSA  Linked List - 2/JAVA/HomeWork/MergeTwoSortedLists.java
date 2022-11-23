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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode tail=null;
        ListNode h3=null;
        if(A.val<=B.val){
            h3=A;
            tail=A;
            A=A.next;
        }
        else{
            h3=B;
            tail=B;
            B=B.next;
        }

        while(A!=null && B!=null){
            if(A.val<=B.val){
                tail.next=A;
                tail=A;
                A=A.next;
            }
            else{
                tail.next=B;
                tail=B;
                B=B.next;
            }
        }
        if(A!=null){
            tail.next=A;
        }
        else{
            tail.next=B;
        }
        return h3;
    }
}
