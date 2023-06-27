package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(4);

        linkedList.getHead();
        linkedList.getLength();
        linkedList.getTail();

        linkedList.append(2);

        linkedList.getLength();

        linkedList.printList();

        linkedList.prepend(7);

        linkedList.printList();
    }
}
