class Solution:
    def bfsOfGraph(self, V, adj):
        ans=[]
        queue=[]
        visited=[False]*V
        visited[0]=True
        queue.append(0)
        while(len(queue)!=0):
            curr=queue.pop(0)
            ans.append(curr)
            for i in adj[curr]:
                if(visited[i]==False):
                    queue.append(i)
                    visited[i]=True
        return ans           
