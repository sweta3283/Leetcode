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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum);
    }

    boolean solve(TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }
        if (targetSum == node.val && node.left == null && node.right == null) {
            return true;
        }
        boolean left = solve(node.left, targetSum - node.val);
        boolean right = solve(node.right, targetSum - node.val);
        return left || right;
    }
}