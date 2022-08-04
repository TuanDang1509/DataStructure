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
    public static LinkedList insertNthPosition (LinkedList list, int data, int position){
        if (position == 0){
            return add(list, data);
        }
        Node newNode = new Node(data);
        Node temp = list.head;
        for (int i = 0; i <= position - 2; i ++){
            temp = temp.next;
            if (temp == null){
                System.out.println("Invalid position");
                return list;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return list;
    }
    public static LinkedList deleteNthPosition (LinkedList list, int position)
    {
        if (position == 0){
            list.head = list.head.next;
        }
        else {
            Node temp = list.head;
            for (int i = 0; i <= position - 2; i ++){
                temp = temp.next;
                if (temp == null){
                    System.out.println();
                    System.out.println("Invalid position");
                    return list;
                }
            }
            temp.next = temp.next.next;
        }
        return list;
    }
    public static LinkedList add (LinkedList list, int data){
        Node newNode = new Node (data);
        if (list.head != null) {
            newNode.next = list.head;
        }
        list.head = newNode;
        return list;
    }
    public static LinkedList reverse (LinkedList list){
        Node prev, curr, next;
        curr = list.head;
        prev = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        return list;
    }
    public static void printLinkedList (LinkedList list){
        System.out.println("Linked listed: ");
        Node temp = list.head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }
    public static void printLinkedListRecursion (Node head){
        if (head == null){
            System.out.println("\n");
            return;
        }
        System.out.print(head.data + " ");
        printLinkedListRecursion(head.next);
    }
}
