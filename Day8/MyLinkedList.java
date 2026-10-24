public class MyLinkedList {

    public static class Node {
        int value;
        Node next; 

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static Node insertBegin(Node head , int value){
        Node newNodeBegin = new Node(value);
        newNodeBegin.next = head;
        return newNodeBegin;
        
    }

   
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void insertEnd(Node head, int value){
        Node newNodeEnd = new Node(value);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNodeEnd;
    }
    

    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        head = insertBegin(head , 5);

        printList(head);

        insertEnd(head , 40);

        printList(head);

    }
}
