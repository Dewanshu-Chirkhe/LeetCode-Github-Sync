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
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void bfs(TreeNode root, int level, List<List<Integer>> ans){
        if(root == null) return;
        ans.get(level).add(root.val);

        if(root.left != null) bfs(root.left, level+1, ans);
        if(root.right != null) bfs(root.right, level+1, ans);

        return;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = height(root); 

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<height ; i++){
            ans.add(new ArrayList<>());
        }

        bfs(root, 0, ans);

        return ans;
    }
}