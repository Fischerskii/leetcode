package org.example;

public class App {
    public static void main(String[] args) {
        TreeNode rightNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), rightNode);
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));

        if (root.left.left != null)
            System.out.println("Not null");
    }
}
