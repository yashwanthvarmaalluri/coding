#Method1 DFS
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

# method 2 union find rank 

class Solution:
    def find(self,u,parent):
        if(parent[u]==u):
            return u
        val=self.find(parent[u],parent)
        parent[u]=val
        return val
    def union(self,u,v,parent,rank):
        parentu=self.find(u,parent)
        parentv=self.find(v,parent)
        if(rank[parentu]>rank[parentv]):
            parent[parentv]=parentu
        elif(rank[parentu]<rank[parentv]):          
            parent[parentu]=parentv
        else:
            rank[parentu]+=1
            parent[parentv]=parentu
    def solve(self, V,E,Values,Edges):
        parent=[0]*V
        rank=[0]*V
        for i in range(V):
            parent[i]=i
        for i in range(E):
            self.union(Edges[i][0]-1,Edges[i][1]-1,parent,rank)
        root_sum={}
        for i in range(V):
            x=self.find(i,parent)
            if x in root_sum:
                root_sum[x]+=Values[i]
            else:
                root_sum[x]=Values[i]
        return max(root_sum.values())
        
        


