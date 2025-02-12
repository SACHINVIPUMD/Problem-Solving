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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        boolean rev = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList();
            for(int i=0;i<size;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().val);
            }
            if(rev){
                // Collections.reverse(list);
                for(int i=0;i<list.size()/2;i++){
                    int temp = list.get(i);
                    list.set(i,list.get(list.size()-i-1));
                    list.set(list.size()-i-1,temp);
                }
                ans.add(list);
                rev = false;
            }
            else{
                ans.add(list);
                rev = true;
            }
        }
        return ans;
    }
}