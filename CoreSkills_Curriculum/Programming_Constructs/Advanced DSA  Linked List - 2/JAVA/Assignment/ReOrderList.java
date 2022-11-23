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
    public ListNode reorderList(ListNode A) {
        if(A==null || A.next==null){
            return A;
        }
        ListNode mid=findMid(A);
        ListNode midNext = mid.next;
        mid.next=null;
        ListNode secondPart=reverseList(midNext);
        ListNode h = mergeTwoLists(A,secondPart);
        return h;
    }
    public ListNode mergeTwoLists(ListNode a, ListNode b){
        if(a==null){
            return a;
        }
        if(b==null){
            return a;
        }
        ListNode h=a;
        ListNode temp =h;
        a=a.next;
        boolean check=true;
        while(a!=null && b!=null){
            if(check){
                temp.next=b;
                temp=temp.next;
                b=b.next;
                check=false;
            }
            else{
                temp.next=a;
                temp=temp.next;
                a=a.next;
                check=true;
            }
        }
        if(a!=null){
            temp.next=a;
        }
        else{
            temp.next=b;
        }
        return h;
    }
    public ListNode findMid(ListNode A){
        if(A==null || A.next==null || A.next.next==null){
            return A;
        }
        ListNode slow=A;
        ListNode fast=A;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode A){
        if(A.next==null){
            return A;
        }
        ListNode prev=null;
        ListNode curr=A;
        ListNode currNext=null;
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
