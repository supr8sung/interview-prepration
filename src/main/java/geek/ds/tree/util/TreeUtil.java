package geek.ds.tree.util;


import geek.ds.tree.Node;

import java.util.List;
import java.util.Objects;

public abstract class TreeUtil {
    public static void printInorder(Node root) {
        if (Objects.isNull(root))
            return;
        printInorder(root.left);
        System.out.print(root.key + " ");
        printInorder(root.right);
    }

    public static void writeAsInorder(Node node, List<Node> nodes) {
        if (Objects.isNull(node))
            return;
        writeAsInorder(node.left, nodes);
        nodes.add(node);
        writeAsInorder(node.right, nodes);

    }
}
