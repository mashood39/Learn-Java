class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singlyLinkedList2 {
    public static void main(String[] args) {
        System.out.println("implementation of singly linked list :-");

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        list.display();

        System.out.println("\ndelete the given value in the linked list");
        list.deleteValue(70);

        list.display();

        System.out.println("\ndelete at the given index");
        list.deleteAtIndex(1);

        list.display();



    }
}

class LinkedList {

    Node head;

    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    void deleteValue(int data){
        
        if(head.data == data){
            head = head.next;
        }
        Node temp = head;
        Node curr = null;


        while(temp != null){
            if(temp.data == data){
                curr.next = temp.next;
                temp = temp.next;
            }
            else{
                curr = temp;
                temp = temp.next;
            }
        }

        if(temp == null){
            System.out.println("the value not found");
        }
    }

    void deleteAtIndex(int index){

        if(index == 0) head = head.next;

        else{
            Node temp = head;
            Node curr = null;

            for(int i = 0;i < index - 1;i++){
                temp = temp.next;
            }

            curr = temp.next;
            temp.next = curr.next;
            // curr = null;
        }
    }

    void display() {

        if (head == null) {
            System.out.println("the linked list is empty");
        }

        else {
            Node temp = head;

            while (temp.next != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print(temp.data+ "\n\n");
        }

    }
}
