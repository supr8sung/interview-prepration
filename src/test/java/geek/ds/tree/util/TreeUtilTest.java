package geek.ds.tree.util;

import geek.ds.tree.Node;
import geek.ds.tree.bst.BST;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class TreeUtilTest extends BST {
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

    @Test
    public void should_get_tree_as_list_in_order() {
        List<Node> nodes = new ArrayList<>();
        TreeUtil.writeAsInorder(root, nodes);
        assertThat(nodes).hasSize(7);
        List<Integer> keys = nodes.stream().map(e -> e.key).collect(toList());
        assertThat(keys).containsExactly(4, 8, 10, 12, 14, 20, 22);

    }
}