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
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            while(s>0){
                TreeNode r = q.remove();
                list.add(r);
                if(r.left!=null){q.add(r.left);}
                if(r.right!=null){q.add(r.right);}
                s--;
            }
        }
        int l=0;
        for(int i=0,j=0;i<list.size()&&j<list.size();i=i*2+1,j=j*2+2){
            if(l%2!=0){
                reverse(i,j,list);
            }
            l++;
        }
        return makeTree(list,0);
    }
    public void  reverse(int i, int j, List<TreeNode> list){
        while(i<j){
            TreeNode x = list.get(i);
            list.set(i,list.get(j));
            list.set(j,x);
            i++;
            j--;
        }
    }
    public TreeNode makeTree(List<TreeNode> list,int i){
        if(i>=list.size()){
            return null;
        }
        list.get(i).left = makeTree(list,i*2+1);
        list.get(i).right= makeTree(list,i*2+2);
        return list.get(i);
    }
}