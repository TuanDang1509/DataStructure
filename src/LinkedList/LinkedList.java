package LinkedList;

public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList insert (LinkedList list, int data){
        Node newNode = new Node (data);

        if (list.head == null){
            list.head = newNode;
        }
        else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static LinkedList add (LinkedList list, int data){
        Node newNode = new Node (data);
        if (list.head != null) {
            Node temp = list.head;
            newNode.next = temp;
        }
        list.head = newNode;
        return list;
    }
    public static void printLinkedList (LinkedList list){
        System.out.println("Linked listed: ");
        Node temp = list.head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
