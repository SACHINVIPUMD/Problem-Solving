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
        int[] pathsum = new int[1];
        height(root,pathsum);
        return pathsum[0];
    }
    public int height(TreeNode root,int[] pathsum){
        if(root == null){
            return 0;
        }
        int lh = Math.max(0,height(root.left,pathsum));
        int rh = Math.max(0,height(root.right,pathsum));
        pathsum[0] = Math.max(pathsum[0],lh+rh+root.val);
        return Math.max(lh,rh)+root.val;
    }
}