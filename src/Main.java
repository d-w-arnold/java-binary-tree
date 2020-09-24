/**
 * Main method.
 *
 * @author David W. Arnold
 * @version 07/09/2020
 */
public class Main
{
    public static void main(String[] args)
    {
        BinaryTreeOps binaryTreeOps = new BinaryTreeOps();
        BinaryTreeNode root = new BinaryTreeNode(
                4,
                new BinaryTreeNode(
                        2,
                        new BinaryTreeNode(1),
                        new BinaryTreeNode(3)
                ),
                new BinaryTreeNode(
                        7,
                        new BinaryTreeNode(
                                6,
                                new BinaryTreeNode(8),
                                null
                        ),
                        new BinaryTreeNode(9)
                )
        );
        System.out.println(binaryTreeOps.totalBinaryTreeRecursive(root));
        System.out.println(binaryTreeOps.totalBinaryTreeIterative(root));
        binaryTreeOps.reverseRecursive(root);
        binaryTreeOps.reverseIterative(root);
        System.out.println(binaryTreeOps.sumTreeDepths(root));
        System.out.println(binaryTreeOps.sumTreeDepthsExtra(root));
    }
}
