/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

 //O(N) TC
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if(A==null || A.next==null || B==1 || B==C){
          return A;
      }
      int count=B;
      ListNode curr = A;
      ListNode prev=null;
      ListNode currNext=null;
      while(curr!=null && count>0){
          currNext=curr.next;
          curr.next=prev;
          prev=curr;
          curr=currNext;
          count--;
      }
      if(curr!=null){
          A.next=reverseList(curr,B);
      }
      return prev;
    }
}
