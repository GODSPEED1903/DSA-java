
import java.util.Arrays;
import java.util.List;


class Node{
    int data;
    Node next;

    public Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}


public class InsertAtHead {

    public static void printLL(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node insertHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12,5,3,5,0);

        int val = 100;
         Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        head = insertHead(head, val);

        // Printing the linked list
        printLL(head);
    }
}