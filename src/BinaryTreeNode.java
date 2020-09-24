/**
 * BinaryTreeNode class.
 * <p>
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
     * Initialise the {@link BinaryTreeNode} class, as a leaf node.
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
     * Initialise the {@link BinaryTreeNode} class, as an internal node.
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
}
