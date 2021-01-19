class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        queue=[]
        rowlen=len(grid)
        collen=len(grid[0])
        for i in range(rowlen):
            for j in range(collen):
                if(grid[i][j]==2):
                    queue.append([i,j])
        rowoffset=[1,0,-1,0]
        coloffset=[0,1,0,-1]
        time=0
        while(len(queue)!=0):
            flag=False
            for f in range(len(queue)):
                curr=queue.pop(0)
                row=curr[0]
                col=curr[1]
                for g in range(4):
                    row1=row+rowoffset[g]
                    col1=col+coloffset[g]
                    if(row1>=0 and row1<rowlen and col1>=0 and col1<collen and grid[row1][col1]==1):
                        grid[row1][col1]=2
                        queue.append([row1,col1])
                        flag=True
            if(flag):
                time+=1
        for i in range(rowlen):
            for j in range(collen):
                if(grid[i][j]==1):
                    return -1
        return time
        
