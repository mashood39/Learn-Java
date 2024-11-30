
class Node {
	int data;
	Node next;
}

class singlyLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(25);

		list.insertAt(0, 55);

		list.deleteAt(2);

		list.display();
	}

}

class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			// System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	public void display() {
		Node node = head;

		while (node.next != null) {
			System.out.print(node.data + "-->");
			node = node.next;
		}
		System.out.println(node.data);
	}
}