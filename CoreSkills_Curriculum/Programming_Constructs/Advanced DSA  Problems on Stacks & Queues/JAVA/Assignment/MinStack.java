// O(1) TC

class Solution {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            next=null;
            val=x;
        }
    }
    ListNode dum= new ListNode(-1);
    ListNode head=dum;
    Stack<Integer> s = new Stack<>();
    public void push(int x) {
        ListNode curr= new ListNode(x);
        curr.next=head;
        head=curr;
        if(s.isEmpty()){
            s.push(x);
        }
        else if(x<=s.peek()){
            s.push(x);
        }
    }

    public void pop() {
        if(head.val==-1){
            return;
        }
        if(head.val==s.peek()){
            s.pop();
        }
        {
            head=head.next;
        }
    }

    public int top() {
        if(head.val==-1){
            return -1;
        }
        else{
            return head.val;
        }
    }

    public int getMin() {
        if(!s.isEmpty()){
            return s.peek();
        }
        return -1;
    }
}
