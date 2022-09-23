//O(N^2) TC

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode head=null;
    public int size=0;
    public ListNode solve(int[][] A) {
        for(int i=0;i<A.length;i++){
            int a=A[i][0];
            if(a==0){
                int val=A[i][1];
                insertAtIndex(val,0);
            }
            if(a==1){
                int val=A[i][1];
                insertAtIndex(val,size);
            }
            if(a==2){
                int val=A[i][1];
                int index=A[i][2];
                insertAtIndex(val,index);
            }
            if(a==3){
                int index=A[i][1];
                deleteIndexElement(index);
            }
        }
        return head;
    }
    public void deleteIndexElement(int index) {
        if(index>=size){
            return;
        }
        if(index==0){
            head=head.next;
        }
        else {
            int count=0;
            ListNode t = head;
            while(count<index-1){
                t=t.next;
                count++;
            }
            t.next=t.next.next;
        }
        size--;
    }

    public void insertAtIndex(int val, int index) {
        if(index>size){
            return;
        }
        if(index==0){
            ListNode a =new ListNode(val);
            a.next=head;
            head=a;
        }
        else{
            ListNode a = new ListNode(val);
            int count=0;
            ListNode t = head;
            while(count<index-1){
                t=t.next;
                count++;
            }
            a.next=t.next;
            t.next=a;
        }
        size++;
    }
}
