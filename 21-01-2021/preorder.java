class Solution {
    List<Integer> l= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            l.add(root.val);
            preorderTraversal(root.left);            
            preorderTraversal(root.right);
        }return l;
    }
}
