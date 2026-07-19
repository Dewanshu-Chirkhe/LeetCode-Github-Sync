class Solution {
    public static int ans;
    public int count(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        if(root.left == null && root.right == null){
            ans++;
            return root.val;
        }

        int leftMax = count(root.left);
        int rightMax = count(root.right);
        int subtreeMax = Math.max(root.val, Math.max(leftMax, rightMax));

        if(root.val == subtreeMax) ans++;

        return subtreeMax;
    }
    public int countDominantNodes(TreeNode root) {
        ans = 0;
        count(root);
        return ans;
    }
}