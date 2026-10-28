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
class BSTIterator {
    List<TreeNode> list = new ArrayList<>();
    int i=0;
    public BSTIterator(TreeNode root) {
        inorderTraverse(root,list);
    }
    public int next() {
       return list.get(i++).val;
    }
    public boolean hasNext() {
        if(i<list.size()){
            return true;
        }
        return false;
    }
    public void inorderTraverse(TreeNode root, List<TreeNode> list){
        if(root==null){
            return;
        }
        inorderTraverse(root.left,list);
        list.add(root);
        inorderTraverse(root.right,list);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */