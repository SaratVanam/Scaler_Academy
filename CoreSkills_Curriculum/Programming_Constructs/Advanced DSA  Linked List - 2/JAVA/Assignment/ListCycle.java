/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

 // O(N)
public class Solution {
	public ListNode detectCycle(ListNode a) {
        ListNode s=a;
        ListNode f=a;
        ListNode c=null;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                c=s;
                break;
            }
        }
        if(s!=f){
            return null;
        }
        ListNode temp1=a;
        ListNode temp2 = c;
        while(temp2!=temp1){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
	}
}
