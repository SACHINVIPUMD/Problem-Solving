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
class Pair{
    TreeNode node;
    int id;
    Pair(TreeNode node,int id){
        this.node = node;
        this.id = id;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList();
        int depth = 0;
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int first=0,last=0;
            int size = q.size();
            int minid = q.peek().id;
            for(int i=0;i<size;i++){
                int cur_id = q.peek().id-minid;
                TreeNode cur_node = q.poll().node;
                if(i==0){
                    first = cur_id;
                }
                if(i==size-1){
                    last = cur_id;
                }
                if(cur_node.left!=null){ 
                    q.offer(new Pair(cur_node.left,2*cur_id+1));
                } 
                if(cur_node.right!=null){ 
                    q.offer(new Pair(cur_node.right,2*cur_id+2));
                } 
                depth = Math.max(depth,last-first+1);
            }
        }
        return depth;
    }
}