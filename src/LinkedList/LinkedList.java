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
        System.out.println("head " + head.value);
    }

    public  void getTail(){
        System.out.println("tail " + tail.value);
    }
    public  void getLength(){
        System.out.println("length " + length);
    }

    public  void  append(int value){
        Node newNode = new Node(value);
        if (length ==0 ){
            head = newNode ;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length ++;
    }

    public  Node removeLast(){
        if(length == 0 ) return  null;

            Node temp = head;
            Node pre = head;
            //loop until temp - remove teamp -> return temp
            while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre ;
            tail.next = null ;
            length --;
            if (length == 0) {
                head = null;
                tail = null;
            }

            return  temp;
    }

    public  void prepend ( int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode ;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public  boolean  set( int index, int value){
        Node temp = get(index);
        if ( temp != null){
            temp.value = value;
            return true;
        }
        return  false;

    }

    public Node get (int index){
            if ( index < 0 || index >= length){
                return  null;
            }

            Node temp = head;
            for ( int i = 0 ; i < index ; i ++){
                temp = temp.next;
            }
            return  temp;

    }

    public  boolean insert( int index, int value){
        if (index < 0 || index > length ) return  false ;

        if ( index == 0 ){
            prepend(value);
            return  true;
        }
        if( index == length){
            return  true;
        }

        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        return  true;
    }






}
class Node {
    int value;
    Node next;
    Node (int value){
        this.value = value;
    }
}


