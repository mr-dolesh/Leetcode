class Solution {
    public boolean isBalanced(TreeNode root) {
        return h(root) != -1;
    }

    public int h(TreeNode root){
        if(root == null) return 0;

        int left = h(root.left);
        if(left == -1) return -1;

        int right = h(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
}