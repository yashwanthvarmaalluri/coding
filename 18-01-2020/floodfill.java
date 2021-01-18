class Solution {
    public void colorchange(int[][]image,int sr,int sc,int r,int c,int colour,int newcolor ){
        if(sr<0 || sr>=r || sc<0 || sc>=c || colour!=image[sr][sc])return;
        image[sr][sc]=newcolor;
        colorchange(image,sr+1,sc,r,c,colour,newcolor);
        colorchange(image,sr,sc+1,r,c,colour,newcolor);
        colorchange(image,sr-1,sc,r,c,colour,newcolor);
        colorchange(image,sr,sc-1,r,c,colour,newcolor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)return image;
        int r=image.length;
        int c=image[0].length;
        int colour=image[sr][sc];
        colorchange(image,sr,sc,r,c,colour,newColor);
        return image;
    }
} 
