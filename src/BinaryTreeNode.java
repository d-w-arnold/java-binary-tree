import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreeNode class.
 *
 * A node in a BinaryTree.
 *
 * @author David W. Arnold
 * @version 07/09/2020
 */
public class BinaryTreeNode
{
    private int value;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    /**
     * Leaf node constructor.
     *
     * @param value The value of the node.
     */
    public BinaryTreeNode(int value)
    {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Internal node constructor.
     *
     * @param value      The value of the node.
     * @param leftChild  The left child node.
     * @param rightChild The right child node.
     */
    public BinaryTreeNode(int value, BinaryTreeNode leftChild, BinaryTreeNode rightChild)
    {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public BinaryTreeNode getLeftChild()
    {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild)
    {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild()
    {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild)
    {
        this.rightChild = rightChild;
    }

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
}
