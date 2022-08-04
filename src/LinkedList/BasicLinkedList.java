package LinkedList;

import org.w3c.dom.Node;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList = LinkedList.insert(linkedList, 1);
        linkedList = LinkedList.insert(linkedList, 2);
        linkedList = LinkedList.insert(linkedList, 3);
        linkedList = LinkedList.insert(linkedList, 5);
        linkedList = LinkedList.insert(linkedList, 4);
        linkedList = LinkedList.add(linkedList, 7);
        LinkedList.printLinkedList(linkedList);
    }
}
