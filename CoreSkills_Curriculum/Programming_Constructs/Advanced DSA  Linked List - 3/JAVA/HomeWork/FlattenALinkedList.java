/*
class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
*/

// O(NLogN) TC
ListNode flatten(ListNode root) {
    ListNode temp = root; // traverse the given list
        while(temp!=null){
            ListNode next=temp.right; //storing the address of the right node
            while(temp.down!=null){ // if the curr temp node has any down value, we attach it to the right of the current node
                temp.right=temp.down;
                temp.down=null;
                temp=temp.right; // move to the down node
            }
            temp.right=next; // attach the curr temp node to the next node stored previously
            temp=temp.right; // traverse to the right node once we finish traversing the down part of the curr node
        }
        root=mergeSort(root);
        temp=root;
        while(temp!=null){
            ListNode next=temp.right;
            temp.right=null;
            temp.down=next;
            temp=next;
        }
        return root;
}

public ListNode mergeSort(ListNode a){
        if(a==null || a.right==null){
            return a;
        }
        ListNode temp1=a;
        ListNode temp2=a;
        while(temp2.right!=null && temp2.right.right!=null){
            temp1=temp1.right;
            temp2=temp2.right.right;
        }
        ListNode midNext=temp1.right;
        temp1.right=null;
        ListNode x=mergeSort(a);
        ListNode y= mergeSort(midNext);
        return merge(x,y);
    }
    public ListNode merge(ListNode x, ListNode y){
        ListNode h3=null;
        ListNode temp=null;
        if(x.val<=y.val){
            h3=x;
            temp=x;
            x=x.right;
        }
        else{
            h3=y;
            temp=y;
            y=y.right;
        }
        while(x!=null && y!=null){
            if(x.val<=y.val){
                temp.right=x;
                temp=temp.right;
                x=x.right;
            }
            else{
                temp.right=y;
                temp=temp.right;
                y=y.right;
            }
        }
        if(x!=null){
            temp.right=x;
        }
        else{
            temp.right=y;
        }
        return h3;
    }