/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    long count = 0L;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        solve(root, targetSum, 0L);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return (int)count;
    }

    void solve(TreeNode node, int targetSum, long sum) {
        if (node == null) {
            return;
        }
        sum = sum + node.val;
        if (targetSum == sum) {
            count++;
        }

        solve(node.left, targetSum, sum);
        solve(node.right, targetSum, sum);

    }
}