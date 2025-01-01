package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        execute(root, 0);
        return result;
    }

    private void execute(TreeNode root, int deepLevel) {
        if (root == null) {
            return;
        }

        List<Integer> currentLevelValues;
        if (result.size() <= deepLevel) {
            result.add(new ArrayList<>());
        }
        currentLevelValues = result.get(deepLevel);
        currentLevelValues.add(root.val);

        if (root.left != null) {
            execute(root.left, deepLevel + 1);
        }

        if (root.right != null) {
            execute(root.right, deepLevel + 1);
        }
    }
}
