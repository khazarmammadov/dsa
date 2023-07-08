package dsa.tree;

public class BinaryTree {
    NodeTree root;

    BinaryTree() {
        root = null;
    }

    NodeTree newNode(int data) {
        root = new NodeTree(data);
        System.out.println(data + " Addeddd......");
        return root;
    }

    NodeTree insert(NodeTree root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left,data);
            } else {
                root.right = insert(root.right,data);

            }
        } else {
            root = newNode(data);
        }
        return root;

    }
}
