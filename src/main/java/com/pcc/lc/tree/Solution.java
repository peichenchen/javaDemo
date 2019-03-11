package com.pcc.lc.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author peichenchen
 * @date 2019/03/06
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        results.add(root.val);

        results.addAll(preorderTraversal(root.left));
        results.addAll(preorderTraversal(root.right));

        return results;
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        results.addAll(inorderTraversal(root.left));
        results.add(root.val);
        results.addAll(inorderTraversal(root.right));

        return results;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        results.addAll(postorderTraversal(root.left));
        results.addAll(postorderTraversal(root.right));
        results.add(root.val);

        return results;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelResults = new ArrayList<>();
            int count = queue.size();
            while (count > 0) {
                TreeNode treeNode = queue.poll();
                levelResults.add(treeNode.val);

                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }

                count--;
            }
            results.add(levelResults);

        }

        return results;
    }


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int answer = 1;

        maxDepth(root.left, answer + 1);

        return 0;

    }

    private int maxDepth(TreeNode node, int curDepth) {
        if (node.left != null) {
            maxDepth(node.left, curDepth + 1);
        }

        if (node.right != null) {
            maxDepth(node.right, curDepth + 1);
        }



        return curDepth;
    }

}
