package geek.ds.tree.bst;


import geek.ds.tree.Node;

import java.util.Objects;

public class BST {

    private static int bstCount = 0;

    protected static Node findSuccessor(Node root, Node node) {
        if (Objects.isNull(node))
            return null;
        if (Objects.nonNull(node.right))
            return findNext(node.right);
        Node successor = null;
        while (root != null) {
            if (root.key > node.key) {
                successor = root;
                root = root.left;
            } else if (root.key < node.key)
                root = root.right;
            else
                break;
        }
        return successor;
    }

    private static Node findNext(Node node) {

        while (node.left != null)
            node = node.left;
        return node;
    }

    protected static Node recursiveDelete(Node root, int value) {
        if (root == null)
            return root;
        if (root.key > value) {
            root.left = recursiveDelete(root.left, value);
        } else if (root.key < value) {
            root.right = recursiveDelete(root.right, value);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = recursiveDelete(root.right, root.key);

        }
        return root;
    }

    private static int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }


    protected static Node addIfAbsent(Node root, int value) {
        Node node = search(root, value);
        return Objects.nonNull(node) ? node : add(root, value);
    }

    protected static Node add(Node root, int value) {

        if (Objects.isNull(root))
            return new Node(value);

        if (root.key > value)
            root.left = add(root.left, value);
        else
            root.right = add(root.right, value);
        return root;
    }

    protected static Node search(Node root, int value) {
        return (Objects.isNull(root) || root.key == value) ? root
                : root.key > value ? search(root.left, value) : search(root.right, value);
    }

    public static int totalBstPresent(Node root) {
        if (Objects.isNull(root))
            return 0;
        if (Objects.isNull(root.left)) {
            if (Objects.isNull(root.right))
                bstCount++;
            else if (root.right.key > root.key)
                bstCount++;
        }
        else if (Objects.isNull(root.right)) {
            if (root.left.key < root.key)
                bstCount++;
        }

        totalBstPresent(root.left);
        totalBstPresent(root.right);
        return bstCount;
    }

}
