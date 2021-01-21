class Solution {
    List<List<Integer>> L= new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){return L;}
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l= new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                l.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
               }
            if(flag)L.add(l);
            else{Collections.reverse(l);
                L.add(l);}
            flag=!flag;
             }
    return L;
    }
}
