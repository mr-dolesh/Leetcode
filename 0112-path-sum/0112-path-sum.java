class Solution {
    public boolean r(TreeNode root, int targetSum, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null){
            sum = sum + root.val;
            if(sum == targetSum) return true;
        } 
        return r(root.left, targetSum, sum + root.val) || r(root.right, targetSum, sum + root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum){
        int sum = 0;
        return r(root, targetSum, sum);
    }
}