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


public class first{
    public static void main(String[] args) {
        int[] arr = {2,5,3,9};

        Node x = new Node(arr[0]);
        Node y = x;
        System.out.println(y);
    }
}