class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class dLinkedList {
    public static void main(String[] args) {

       dLL dList = new dLL();

       dList.insert(10);
       dList.insert(20);
       dList.insert(30);
       dList.insert(40);

       dList.display();

       dList.deleteAtIndex(3);

       dList.display();
    }
}

class dLL{

    Node head;
    
    void insert(int data){
        
        Node newNode = new Node(data);

        if(head == null) head = newNode;

        else{
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteAtIndex(int index){

        if(index == 0) head = head.next;

        else{

            Node temp = head;

            for(int i = 0;i < index ;i++){
                temp = temp.next;
            }

            temp.prev.next = temp.next;
        }
    }
    
    void display(){

        if(head == null) {
            System.out.println("the linked list is empty");
        }

        else{

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}