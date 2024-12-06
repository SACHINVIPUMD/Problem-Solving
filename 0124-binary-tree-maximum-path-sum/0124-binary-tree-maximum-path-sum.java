/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] pathsum = new int[1]; // Array to hold the maximum path sum
        pathsum[0] = Integer.MIN_VALUE; // Initialize to the smallest value
        findMaxPathSum(root, pathsum);
        return pathsum[0];
    }

    public int findMaxPathSum(TreeNode root, int[] pathsum) {
        if (root == null) {
            return 0; // Return 0 if the node is null
        }

        // Recursively calculate the maximum sum from left and right subtrees
        int left = Math.max(0, findMaxPathSum(root.left, pathsum)); // Discard negative values
        int right = Math.max(0, findMaxPathSum(root.right, pathsum)); // Discard negative values

        // Update the global maximum path sum
        pathsum[0] = Math.max(pathsum[0], left + right + root.val);

        // Return the maximum path sum through the current node to its parent
        return Math.max(left, right) + root.val;
    }
}
