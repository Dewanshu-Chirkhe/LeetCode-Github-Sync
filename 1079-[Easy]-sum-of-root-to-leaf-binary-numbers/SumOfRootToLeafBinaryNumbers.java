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
    public void dfs(String num, TreeNode root, List<String> list){
        if(root == null) return;
        num += root.val;

        if(root.left == null && root.right == null){
            list.add(num);
            return;
        }
        
        if(root.left != null) dfs(num, root.left, list);
        if(root.right != null) dfs(num, root.right, list);
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String> list = new ArrayList<>();

        dfs("", root, list);

        int ans = 0;
        for(String binary : list){
            int decimal = Integer.parseInt(binary, 2);
            ans += decimal;
        }

        return ans;
    }
}