class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int lefth=maxDepth(root.left);
        int righth=maxDepth(root.right);
        return Math.max(lefth,righth)+1;
    }
}
