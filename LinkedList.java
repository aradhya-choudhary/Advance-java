public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head; // properties of class node
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null){
        head = tail = newNode;
        return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void print() {
        if(head == null){
            System.out.println("empty");
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println(" null ");
    }
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
         Node newNode = new Node(data);
         size++;
        Node temp = head;
        int count = 0;
        while(count < idx-1){
            temp = temp.next;
            count++;
        }
       
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            head = tail = null;
            size = 0;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return 0;
        }
        if(size == 1){
            int  val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
      
        Node prev = head;
          
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data; // prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
        
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr !=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int search(int key) {
        Node temp = head;
        int i =1;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addLast(1);
        
        ll.addLast(2);
       
        ll.addLast(3);
        
        ll.addLast(4);
        // ll.add(2, 9);
        ll.addLast(5);
        ll.reverse();
        ll.print();

        
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        // System.out.println(ll.size);
    System.out.println(ll.search(3));
    System.out.println(ll.search(10));

    }
    
}
