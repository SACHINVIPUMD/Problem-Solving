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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        List<List<Integer>> list = new ArrayList();
        if(root == null){
            return list;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> lvl = new ArrayList();
            int size = q.size();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                lvl.add(q.poll().val);
            }
            list.add(lvl);
        }
        return list;
    }
}