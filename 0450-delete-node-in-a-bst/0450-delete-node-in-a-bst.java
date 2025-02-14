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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(root.val == key){
            return merge(root.left,root.right);
        }
        return search(root,key);
        // return root;
    }
    public TreeNode search(TreeNode root,int key){
        if(root == null) return root;
        if(root.left!=null){//true
            if(root.left.val == key){//false
                root.left = merge(root.left.left,root.left.right);
            }
        } 
        if(root.right!=null){
            if(root.right.val == key){
                root.right = merge(root.right.left,root.right.right);
            }
        }
        if(root.val < key){//goe here
            search(root.right,key);
        }
        else{
             search(root.left,key);
        }
        return root;
    }
    public TreeNode merge(TreeNode lh,TreeNode rh){
        if (lh == null) return rh;
        if (rh == null) return lh;
        TreeNode temp = lh;
        TreeNode lastRightOnLeft = find(lh);
        System.out.println(lastRightOnLeft.val);
        lastRightOnLeft.right = rh;
        return temp;
    }
    public TreeNode find(TreeNode root){
        if(root.right == null){
            return root;
        }
        return find(root.right);
        
    }
}