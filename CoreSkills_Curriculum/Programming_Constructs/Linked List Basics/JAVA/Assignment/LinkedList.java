//O(N) TC

public static class Node{
        int value;
        Node pointer;
        Node(int val){
            value=val;
            pointer=null;
        }
    }
    public static Node head=null;
    public static int size=0;

    

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if(position>size+1){
            return;
        }
        Node a = new Node(value);
        if(position==1 && size==0){
            head=a;
        }
        else if(position==1 && size>0){
            a.pointer=head;
            head=a;
        }
        else{
            Node t= head;
            int count=1;
            while(count<position-1){
                t=t.pointer;
                count++;
            }
            a.pointer=t.pointer;
            t.pointer=a;
        }
        size++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>size){
            return;
        }
        if(position==1 && size>=1){
           head=head.pointer;
        }
        else{
            int count=1;
            Node t=head;
            while(count<position-1){
                t=t.pointer;
                count++;
            }
            t.pointer=t.pointer.pointer;
        }
        size--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        if(size==0){
            return;
        }
        Node t= head;
        while(t.pointer!=null){
            System.out.print(t.value+" ");
            t=t.pointer;
        }
        System.out.print(t.value);
    }

