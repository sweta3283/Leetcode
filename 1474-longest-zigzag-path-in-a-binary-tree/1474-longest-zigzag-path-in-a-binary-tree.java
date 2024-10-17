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
    int max = 0;

    public void solve(TreeNode node, int count, boolean goLeft) {

        if (node == null) {
            return;
        }
        max = Math.max(max, count);
        if (goLeft) {
            solve(node.left, count + 1, false);
            solve(node.right, 1, true);
        } else {
            solve(node.right, count + 1, true);
            solve(node.left, 1, false);
        }

    }

    public int longestZigZag(TreeNode root) {
        solve(root, 0, true);
        solve(root, 0, false);
        return max;
    }
}