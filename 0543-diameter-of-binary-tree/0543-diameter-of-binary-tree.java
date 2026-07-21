class Solution {
    int max = 0;

    private int maxDept(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = maxDept(root.left);
        int right = maxDept(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDept(root);
        return max;
    }
}