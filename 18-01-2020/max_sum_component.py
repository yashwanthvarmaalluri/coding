class Solution{
    public boolean[] visited;
    public ArrayList<ArrayList<Integer>> list;
    public long dfs(int start,int[] Values){
        visited[start]=true;
        long score=Values[start];
        for(Integer i:list.get(start)){
            if(!visited[i])
                score=score+dfs(i,Values);
        }return score;
    }
    long solve(int V,int E,int[] Values,int[][] Edges){
        list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<E;i++){
            list.get(Edges[i][0]-1).add(Edges[i][1]-1);        
            list.get(Edges[i][1]-1).add(Edges[i][0]-1);
        }
    visited=new boolean[V];
    long max=0;
    long score=0;
    for(int i=0;i<V;i++){
        if(!visited[i]){
            score=dfs(i,Values);
        }
        max=Math.max(max,score);
        
    }return max;
    }
    
}
