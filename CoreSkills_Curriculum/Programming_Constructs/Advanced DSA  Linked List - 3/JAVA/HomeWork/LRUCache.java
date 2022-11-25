// O(1) TC

public class Solution {
    public class ListNode{
        int value;
        int key;
        ListNode next;
        ListNode prev;
        ListNode(int key, int value){
            this.value=value;
            this.key=key;
            next=null;
            prev=null;
        }
    }

    public int capacity;
    HashMap<Integer,ListNode> map = new HashMap<>();
    ListNode head= new ListNode(-1,-1);
    ListNode tail = new ListNode(-1,-1);

    public Solution(int capacity) {
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            ListNode x=map.get(key);
            x.prev.next=x.next;
            x.next.prev=x.prev;
            insertAtTail(x);
            return x.value;
        }
        else
            return -1;
    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            ListNode x=map.get(key);
            x.prev.next=x.next;
            x.next.prev=x.prev;
            x.value=value;
            insertAtTail(x);
            return;
        }
        else if(map.size()==capacity){
            ListNode x= head.next;
            int keyToDelete= x.key;
            map.remove(keyToDelete);
            removeStart();
            ListNode a= new ListNode(key,value);
            insertAtTail(a);
            map.put(key,a);
        }
        else if(map.size()<capacity){
            ListNode a= new ListNode(key,value);
            insertAtTail(a);
            map.put(key,a);
        }

    }
    public void removeStart(){
        head.next.next.prev=head;
        head.next=head.next.next;
    }
    public void insertAtTail(ListNode x){
        tail.prev.next=x;
        x.prev=tail.prev;
        x.next=tail;
        tail.prev=x;
    }
}