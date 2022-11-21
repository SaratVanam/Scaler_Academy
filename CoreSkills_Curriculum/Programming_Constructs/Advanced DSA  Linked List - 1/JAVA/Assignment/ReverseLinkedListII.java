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
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A.next==null || B==C ||B>C){
            return A;
        }
        int count=1;
        ListNode temp = A;
        ListNode startPrev=A;// Storing the node before B
        ListNode endPost=A;// Storing the node after C
        ListNode curr = A;
        while(temp!=null && count<C){
            if(count<B){
                startPrev=temp;
                curr=temp.next;
            }
            endPost=temp.next.next;
            temp=temp.next;
            count++;
        }
        //Here we divide the list into 3 parts
        if(B!=1){
            startPrev.next=null;
        }
        temp.next=null;
        //Start reversing the list
        ListNode s= curr;
        ListNode prev=null;
        ListNode currNext=null;
        while(s!=null){
            currNext=s.next;
            s.next=prev;
            prev=s;
            s=currNext;
        }
        //Attach the reversed list accordingly
        if(B!=1){
            startPrev.next=prev;
        }
        else{
            A=prev;
        }
        curr.next=endPost;
        return A;
    }
}
