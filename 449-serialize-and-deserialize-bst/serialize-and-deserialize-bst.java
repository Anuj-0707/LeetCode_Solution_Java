/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    static int i=0;
    StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            sb.append("n,");
            return sb.toString();
        }
        sb.append(root.val).append(',');
        serialize(root.left);
        serialize(root.right);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        i=0;
        String[] s = data.split(",");
        return makeTree(s);
    }
    public TreeNode makeTree(String[] s){
        if(i>=s.length||s[i].equals("n")){
            i++;
            return null;
        }
        int val = Integer.valueOf(s[i++]);
        TreeNode root = new TreeNode(val);
        root.left=makeTree(s);
        root.right=makeTree(s);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;