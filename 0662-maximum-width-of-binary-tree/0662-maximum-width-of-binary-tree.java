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
        int ans = 0;
        if(root == null){
            return ans;
        }
        Queue<Pair> q = new LinkedList();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int min_id = q.peek().id;
            int first=0,last=0;
            for(int i=0;i<size;i++){
                int cur_id = q.peek().id-min_id;
                Pair front = q.poll();
                if(front.node.left!=null){
                    q.offer(new Pair(front.node.left,cur_id*2+1));
                }
                if(front.node.right!=null){
                    q.offer(new Pair(front.node.right,cur_id*2+2));
                }
                if(i==0){
                    first = cur_id;
                }
                if(i==size-1){
                    last = cur_id;
                }
                ans = Math.max(last-first+1,ans);
            }
        }
        return ans;
    }
}