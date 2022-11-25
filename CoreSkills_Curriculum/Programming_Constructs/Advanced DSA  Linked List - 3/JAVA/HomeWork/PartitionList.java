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
    public ListNode partition(ListNode A, int B) {
        ListNode temp=A;
        ListNode a=null;// head for list of elements containing values less than B
        ListNode b=null;// head for list of elements containing values >=B
        ListNode temp1=a;// Node to traverse the list a
        ListNode temp2=b;// Node to traverse the list b
        while(temp!=null){
            if(temp.val<B){
                if(a==null){   //assigning the value for the head
                    a=temp;
                    temp1=a;
                }
                else {
                    temp1.next=temp;
                    temp1=temp1.next;
                }
            }
            else {
                if(b==null){ // assigning the value for the head
                    b=temp;
                    temp2=b;
                }
                else{
                    temp2.next=temp;
                    temp2=temp2.next;
                }
            }
            temp=temp.next;
        }
        if(a==null){
            return b;
        }
        if(b==null){
            temp1.next=null;
        }
        else{
            temp1.next=b; //joining the list a to be
            temp2.next=null;
        }
        return a;
    }
}