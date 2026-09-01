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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root ==  null){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int h = height(root);
        for(int i=1; i<=h; i++){
            List<Integer> ans = new ArrayList<>();
            currentOrder(ans, root, i);
            list.add(ans);
        }
        return list;
    } 
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1+ Math.max(lh,rh);

    }
    public void currentOrder(List<Integer> list, TreeNode root, int level){
        if(level == 0 || root == null){
            return;
        }
        if(level == 1){
            list.add(root.val);
        } else if(level > 1){
            currentOrder(list, root.left, level-1);
            currentOrder(list, root.right, level-1);
        }
    }
}