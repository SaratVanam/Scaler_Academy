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
    public int solve(ListNode A) {
        int count=0;
        ListNode temp = A;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int mid=count/2;
        temp=A;
        count=1;
        while(count<mid){
            count++;
            temp=temp.next;
        }
        return temp.next.val;
    }
}
