import java.util.ArrayList;
import java.util.List;

/**
 * Operations for {@link BinaryTreeNode}.
 *
 * @author David W. Arnold
 * @version 23/09/2020
 */
public class BinaryTreeOps
{
    private int total;

    /**
     * Initialise the {@link BinaryTreeOps} class.
     */
    public BinaryTreeOps()
    {
        total = 0;
    }

    /**
     * Recursively count the total of all nodes in a Binary Tree.
     *
     * @param binaryTreeNode The root node.
     * @return The sum of all nodes in a Binary Tree.
     */
    public int totalBinaryTreeRecursive(BinaryTreeNode binaryTreeNode)
    {
        total = 0;
        totalBinaryTreeRecursiveHelper(binaryTreeNode);
        return total;
    }

    /**
     * Helper method for {@link #totalBinaryTreeRecursive(BinaryTreeNode) totalBinaryTreeRecursive}.
     */
    public void totalBinaryTreeRecursiveHelper(BinaryTreeNode binaryTreeNode)
    {
        if (binaryTreeNode != null) {
            total += binaryTreeNode.getValue();
            if (binaryTreeNode.getLeftChild() != null) {
                totalBinaryTreeRecursiveHelper(binaryTreeNode.getLeftChild());
            }
            if (binaryTreeNode.getRightChild() != null) {
                totalBinaryTreeRecursiveHelper(binaryTreeNode.getRightChild());
            }
        }
    }

    /**
     * Iteratively count the total of all nodes in a Binary Tree.
     *
     * @param binaryTreeNode The root node.
     * @return The sum of all nodes in a Binary Tree.
     */
    public int totalBinaryTreeIterative(BinaryTreeNode binaryTreeNode)
    {
        total = 0;
        totalBinaryTreeIterativeHelper(binaryTreeNode);
        return total;
    }

    /**
     * Helper method for {@link #totalBinaryTreeIterative(BinaryTreeNode) totalBinaryTreeIterative}.
     */
    public void totalBinaryTreeIterativeHelper(BinaryTreeNode binaryTreeNode)
    {
        List<BinaryTreeNode> queue = new ArrayList<>();
        if (binaryTreeNode != null) {
            queue.add(binaryTreeNode);
        }
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.get(0);
            queue.remove(0);
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
            total += node.getValue();
        }
    }

    /**
     * Reverse the Binary Tree using recursion.
     *
     * @param binaryTreeNode The root node.
     */
    public void reverseRecursive(BinaryTreeNode binaryTreeNode)
    {
        if (binaryTreeNode != null) {
            BinaryTreeNode tmp = binaryTreeNode.getLeftChild();
            binaryTreeNode.setLeftChild(binaryTreeNode.getRightChild());
            binaryTreeNode.setRightChild(tmp);
            reverseRecursive(binaryTreeNode.getLeftChild());
            reverseRecursive(binaryTreeNode.getRightChild());
        }
    }

    /**
     * Reverse the Binary Tree using iterative approach.
     *
     * @param binaryTreeNode The root node.
     */
    public void reverseIterative(BinaryTreeNode binaryTreeNode)
    {
        List<BinaryTreeNode> queue = new ArrayList<>();
        if (binaryTreeNode != null) {
            queue.add(binaryTreeNode);
        }
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.get(0);
            queue.remove(0);
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
            BinaryTreeNode tmp = node.getLeftChild();
            node.setLeftChild(node.getRightChild());
            node.setRightChild(tmp);
        }
    }

    /**
     * If the root node has a tree depth of 0, and each layer down the tree depth increases by 1,
     * this finds the sum tree depths for all nodes in the Binary Tree.
     *
     * @param binaryTreeNode The root node.
     * @return The sum of all tree depths for all nodes.
     */
    public int sumTreeDepths(BinaryTreeNode binaryTreeNode)
    {
        return sumTreeDepthsHelper(binaryTreeNode, 0);
    }

    /**
     * Helper method for {@link #sumTreeDepths(BinaryTreeNode) sumTreeDepths}.
     */
    private int sumTreeDepthsHelper(BinaryTreeNode binaryTreeNode, int i)
    {
        int total = i;
        if (binaryTreeNode.getLeftChild() != null) {
            total += sumTreeDepthsHelper(binaryTreeNode.getLeftChild(), i + 1);
        }
        if (binaryTreeNode.getRightChild() != null) {
            total += sumTreeDepthsHelper(binaryTreeNode.getRightChild(), i + 1);
        }
        return total;
    }


    /**
     * If the root node has a tree depth of 0, and each layer down the tree depth increases by 1,
     * this finds the sum tree depths for all nodes in the Binary Tree.
     * <p>
     * Also, does this calculation starting from every node in the Binary Tree,
     * then returns the entire total.
     *
     * @param binaryTreeNode The root node.
     * @return The sum of all tree depths for all nodes, starting from every node.
     */
    public int sumTreeDepthsExtra(BinaryTreeNode binaryTreeNode)
    {
        int total = sumTreeDepths(binaryTreeNode);
        if (binaryTreeNode.getLeftChild() != null) {
            total += sumTreeDepthsExtra(binaryTreeNode.getLeftChild());
        }
        if (binaryTreeNode.getRightChild() != null) {
            total += sumTreeDepthsExtra(binaryTreeNode.getRightChild());
        }
        return total;
    }
}
