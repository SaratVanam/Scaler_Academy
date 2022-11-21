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
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int count=0;
        ListNode temp=A;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(B>count){
            A=A.next;
            return A;
        }
        int check=count-B;
        count=1;
        temp=A;
        if(check==0){
            return A.next;
        }
        while(count<check){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return A;
    }
}
