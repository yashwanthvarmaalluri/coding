class Solution {
    boolean x=true;
    public boolean isBalanced(TreeNode root) {
        bal(root);
        return x;
    }
    public int bal(TreeNode root){
        if(root==null){return 0;}
        int left=bal(root.left);
        int right=bal(root.right);
        if(Math.abs(left-right)>1)x=false;
        return Math.max(left,right)+1;
    }
}
