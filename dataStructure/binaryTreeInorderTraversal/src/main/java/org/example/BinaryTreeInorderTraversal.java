package org.example;

import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(5);

        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);

        System.out.println(result);  // [1, 3, 2]
    }
}
