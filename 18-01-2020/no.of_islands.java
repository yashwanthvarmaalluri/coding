class Solution {
    public void mark_current_island(char[][] grid,int x,int y,int r,int c){
        if(x<0 || x>=r || y<0 || y>=c || grid[x][y]!='1')return;
        grid[x][y]='2';
        mark_current_island(grid,x,y+1,r,c);
        mark_current_island(grid,x+1,y,r,c);
        mark_current_island(grid,x,y-1,r,c);
        mark_current_island(grid,x-1,y,r,c);
    }
    
    
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    count+=1;
                    mark_current_island(grid,i,j,r,c);
                }
            }
        }
    return count;}
}
