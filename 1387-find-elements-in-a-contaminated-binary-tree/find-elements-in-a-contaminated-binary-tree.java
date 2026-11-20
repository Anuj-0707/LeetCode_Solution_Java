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
class FindElements {
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
        root.val = 0;
        helper(root);
    }
    public boolean find(int target) {
        return findTarget(root,target);
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null)root.left.val=2*root.val+1;
        if(root.right!=null)root.right.val=2*root.val+2;
        helper(root.left);
        helper(root.right);
    }
    public boolean findTarget(TreeNode root, int t){
        if(root==null){
            return false;
        }
        if(root.val==t){
            return true;
        }
        return findTarget(root.left,t)||findTarget(root.right,t);
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */