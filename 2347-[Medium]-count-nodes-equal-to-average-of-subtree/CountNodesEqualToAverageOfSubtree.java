class Solution {
    int ans;
    public int[] helper(TreeNode root){
        if(root == null) return new int[]{0, 0};

        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = left[0] + right[0] + root.val;
        int nodes = left[1] + right[1] + 1;

        if(sum / nodes == root.val) ans++;

        return new int[]{sum, nodes};
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return ans;
    }
}