/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList();
        post_order(root,ans);
        return ans;
    }
    public void post_order(Node root,List<Integer> ans){
        if(root == null){
            return;
        }
        List<Node> li = root.children;
        for(Node n : li) {
            post_order(n , ans);
        }
        ans.add(root.val);
    }
}