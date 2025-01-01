package org.example;

public class App {
    public static void main( String[] args ) {
        TreeNode treeNode = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(treeNode));
    }
}
