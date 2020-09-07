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
        BinaryTreeNode root = new BinaryTreeNode(
                4,
                new BinaryTreeNode(
                        2,
                        new BinaryTreeNode(
                                1
                        ),
                        new BinaryTreeNode(
                                3
                        )
                ),
                new BinaryTreeNode(
                        7,
                        new BinaryTreeNode(
                                6,
                                new BinaryTreeNode(
                                        8
                                ),
                                null
                        ),
                        new BinaryTreeNode(
                                9
                        )
                )
        );
        System.out.println();
        root.reverseRecursive(root);
        System.out.println();
        root.reverseIterative(root);
        System.out.println();
    }
}
