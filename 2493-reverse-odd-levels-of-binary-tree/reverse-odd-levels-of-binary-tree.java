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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left,root.right,1);
        return root;
    }
    public void helper(TreeNode ln, TreeNode rn, int l){
        if(ln==null||rn==null){
            return;
        }
        if(l%2!=0){
            int n = ln.val;
            ln.val=rn.val;
            rn.val=n;
        }
        helper(ln.left,rn.right,l+1);
        helper(ln.right,rn.left,l+1);
    }
}