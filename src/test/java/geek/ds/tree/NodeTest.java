package geek.ds.tree;

import geek.ds.tree.binarytree.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
public class NodeTest {

    Node root;

    @Before
    public void setup() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);

        //@formatter:off
        //                 1
        //             2       3
        //          4    5  6    7
        //       8     9
        //@formatter:on
    }

    @Test
    public void should_print_nodes_of_tree_inorder_wise() {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.inorder(root);
        assertThat(binaryTree.nodes).isEqualTo(Arrays.asList(8,4,9,2,5,1,6,3,7));

    }
    @Test
    public  void should_print_nodes_of_tree_preorder_wise(){
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.preorder(root);
        assertThat(binaryTree.nodes).isEqualTo(Arrays.asList(1,2,4,8,9,5,3,6,7));
    }
    @Test
    public  void should_print_nodes_of_tree_postorder_wise(){
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.postorder(root);
        assertThat(binaryTree.nodes).isEqualTo(Arrays.asList(8,9,4,5,2,6,7,3,1));
    }

}