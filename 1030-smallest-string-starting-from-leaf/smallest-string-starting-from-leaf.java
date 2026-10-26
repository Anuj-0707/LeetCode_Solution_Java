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
    public String smallestFromLeaf(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root, sb, list);
        String ans = list.get(0);
        for (String s : list) {
            if (s.compareTo(ans) < 0) {
                ans = s;
            }
        }
        return ans;
    }
    public void helper(TreeNode root, StringBuilder sb, List<String> list) {
        if (root == null) {
            return;
        }
        sb.append((char)(root.val + 'a'));
        if (root.left == null && root.right == null) {
            list.add(new StringBuilder(sb).reverse().toString());
        } else {
            helper(root.left, sb, list);
            helper(root.right, sb, list);
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}