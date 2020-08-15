package geek.ds.tree.bst;

import geek.ds.tree.Node;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BSTTest {
    Node root = null;

    @Before
    public void setup() {
        root = BST.add(root, 20);
        BST.add(root, 8);
        BST.add(root, 22);
        BST.add(root, 4);
        BST.add(root, 12);
        BST.add(root, 10);
        BST.add(root, 14);
    }

    /*
                5
           9          3
       6                   4
   8       7
     */
    @Test
    public void should_give_count_of_total_bst_present_in_any_tree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.right.right = new Node(4);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);
        final int count = BST.totalBstPresent(root);
        assertThat(count).isEqualTo(4);
    }
}