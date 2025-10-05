class Node {
    int data;      // Data stored in the node
    Node next;     // Reference to the next node in the list

    // Constructor with both data and next node as parameters
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class SearchInLinkedList{

    public static int checkifPresent(Node head, int val){

        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                return 1;
            }
            temp = temp.next;
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(checkifPresent(head, val));
    }
}