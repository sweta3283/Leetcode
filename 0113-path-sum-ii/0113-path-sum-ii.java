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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> subRes = new ArrayList<>();
        solve(root, targetSum, subRes);
        return result;
    }

    void solve(TreeNode node, int targetSum, ArrayList<Integer> subRes) {
        if (node == null) {
            return;
        }
        subRes.add(node.val);
        if (node.val == targetSum && node.left == null && node.right == null) {
            result.add(new ArrayList<>(subRes));
        }
        solve(node.left, targetSum - node.val, subRes);

        solve(node.right, targetSum - node.val, subRes);
        subRes.remove(subRes.size() - 1);
    }
}