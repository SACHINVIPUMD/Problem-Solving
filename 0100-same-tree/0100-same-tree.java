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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p,q);
    }
    public boolean isSame(TreeNode p,TreeNode q){
        if(p == null || q==null){
            return p == q;
        }
        if(p.val==q.val){
            return isSame(p.left,q.left) && isSame(p.right,q.right);
        }
        return false;
    }
}