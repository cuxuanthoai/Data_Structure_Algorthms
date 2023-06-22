package LinkedList;


public class LinkedList {
    private  Node head;
    private  Node tail;
    private int length;
    public  LinkedList( int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode;
        length = 1;
    }

    //printList
    public  void  printList(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public  void getHead(){
        System.out.println("head" + head.value);
    }

    public  void getTail(){
        System.out.println("tail" + tail.value);
    }
    public  void getLength(){
        System.out.println("length" + length);
    }

}
class Node {
    int value;
    Node next;
    Node (int value){
        this.value = value;
    }
}


