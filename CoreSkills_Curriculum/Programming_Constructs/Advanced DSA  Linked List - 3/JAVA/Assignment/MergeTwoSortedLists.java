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
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        ListNode h3=null;
        if(A.val<=B.val){
            h3=A;
            A=A.next;
        }
        else{
            h3=B;
            B=B.next;
        }
        ListNode temp = h3;
        while(A!=null && B!=null){
            if(A.val<=B.val){
                temp.next=A;
                A=A.next;
                temp=temp.next;
            }
            else{
                temp.next=B;
                B=B.next;
                temp=temp.next;
            }
        }
        if(A!=null){
            temp.next=A;
        }
        else{
            temp.next=B;
        }
        return h3;
    }
}
