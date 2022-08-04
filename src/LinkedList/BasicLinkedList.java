package LinkedList;

import org.w3c.dom.Node;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("Print linked list after inserting");
        linkedList = LinkedList.insert(linkedList, 1);
        linkedList = LinkedList.insert(linkedList, 2);
        linkedList = LinkedList.insert(linkedList, 3);
        linkedList = LinkedList.insert(linkedList, 5);
        linkedList = LinkedList.insert(linkedList, 4);
        linkedList = LinkedList.add(linkedList, 7);
        LinkedList.printLinkedList(linkedList);

        System.out.println("Print linked list after inserting nth position");
        linkedList = LinkedList.insertNthPosition(linkedList, 8, 1);
        linkedList = LinkedList.insertNthPosition(linkedList, 10, 10);
        LinkedList.printLinkedList(linkedList);

        System.out.println("Print linked list after deleting nth position");
        linkedList = LinkedList.deleteNthPosition(linkedList, 3);
        linkedList = LinkedList.deleteNthPosition(linkedList, 0);
        LinkedList.printLinkedList(linkedList);

        System.out.println("Print linked list after reversing");
        linkedList = LinkedList.reverse(linkedList);
        LinkedList.printLinkedList(linkedList);

        System.out.println("Print recursion");
        LinkedList.printLinkedListRecursion(linkedList.head);
    }
}
