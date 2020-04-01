package geek.ds.tree.binarytree;

import geek.ds.tree.Node;

import java.util.ArrayList;
import java.util.List;
public class BinaryTree {
    public Node root;
    public List<Integer> nodes = new ArrayList<>();

    public BinaryTree() {
        root = null;
    }

    public void inorder(Node node) {

        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.key + " ");
        nodes.add(node.key);
        inorder(node.right);

    }

    public void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        nodes.add(node.key);
        preorder(node.left);
        preorder(node.right);

    }

    public void postorder(Node node) {
        if (node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+" ");
        nodes.add(node.key);
    }
}
