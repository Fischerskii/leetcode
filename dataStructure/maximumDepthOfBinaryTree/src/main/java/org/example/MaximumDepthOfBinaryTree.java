package org.example;

public class MaximumDepthOfBinaryTree {
    int maxDepth;
    int counter = 1;

    public int maxDepth(TreeNode root) {
        depthSearch(root);
        return maxDepth;
    }

    void depthSearch(TreeNode root) {
       if (root == null) {
           return;
       }

       if (root.left != null || root.right != null) {
           counter++;
       }

       if (counter > maxDepth) {
           maxDepth = counter;
       }

       depthSearch(root.left);
       depthSearch(root.right);
    }
}
