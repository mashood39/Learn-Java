class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class tree {

    static Node root;

    public static void main(String[] args) {

        System.out.println("implementation of tree : ");
        insert(8);
        insert(7);
        insert(12);
        insert(15);
        insert(2);
        insert(5);

        System.out.println("inorder traversal :-");
        inorder(root);

        System.out.println("\n");

        System.out.println("preorder traversal :-");
        preorder(root);

        System.out.println("\n");

        System.out.println("post order traversal :-");
        postorder(root);
    }

    static void insert(int data) {

        root = insertHelper(root, data);
    }

    static Node insertHelper(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        }

        else if (data < root.data) {
            root.left = insertHelper(root.left, data);
        }

        else if (data > root.data) {
            root.right = insertHelper(root.right, data);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

}
