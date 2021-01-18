class Solution
{
    private boolean visited[];
    private ArrayList<Integer> ans;
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
         ans=new ArrayList<Integer>();
         visited=new boolean[V];
         dfs(adj,0);
         return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,Integer n){
        visited[n]=true;
        ans.add(n);
        for(Integer i:adj.get(n)){
            if(!visited[i]){
                dfs(adj,i);
            }
        }
    }
}
