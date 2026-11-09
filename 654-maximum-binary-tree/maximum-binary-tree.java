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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int l = nums.length;
        return helper(nums, 0, l-1);
    }
    public static TreeNode helper(int[] nums, int l, int r){
        if(l>r){
            return null;
        }
        if(l==r){
            return new TreeNode(nums[l]);
        }
        int max=Integer.MIN_VALUE,max_idx=-1;
        for(int i=l;i<=r;i++){
            if(nums[i]>max){
                max=nums[i];
                max_idx=i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left=helper(nums,l,max_idx-1);
        root.right=helper(nums,max_idx+1,r);
        return root;
    }
}