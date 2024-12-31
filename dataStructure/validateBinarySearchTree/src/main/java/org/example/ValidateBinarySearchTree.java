package org.example;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return extracted(root, null, null);
    }

    private boolean extracted(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        int nodeVal = root.val;

        if (min != null && nodeVal <= min) {
            return false;
        }

        if (max != null && nodeVal >= max) {
            return false;
        }

        if (!extracted(root.left, min, nodeVal)) return false;
        if (!extracted(root.right, nodeVal, max)) return false;

        return true;
    }
}
