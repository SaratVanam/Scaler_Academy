public static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
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
        Node newNode = new Node(value);
        if(head==null && position==1){
            head=newNode;
        }
        else if(position==1 && size>0){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node temp=head;
            int count=1;
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        size++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>size){
            return;
        }
        if (position==1){
            head=head.next;
        }
        else{
            int count=1;
            Node temp=head;
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
        }
        size--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        if(size==0){
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
public static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
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
        Node newNode = new Node(value);
        if(head==null && position==1){
            head=newNode;
        }
        else if(position==1 && size>0){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node temp=head;
            int count=1;
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        size++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>size){
            return;
        }
        if (position==1){
            head=head.next;
        }
        else{
            int count=1;
            Node temp=head;
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
        }
        size--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        if(size==0){
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data+" ");
            }
            temp=temp.next;
        }
    }
