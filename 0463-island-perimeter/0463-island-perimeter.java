class Solution {
    public int islandPerimeter(int[][] a) {
        
        int row=a.length;
        int col=a[0].length;
        int p=0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(a[i][j]==1)
                {
                    if(i==0|| a[i-1][j]==0) p++;//top
                    if(i==row-1|| a[i+1][j]==0)p++;
                    if(j==0||a[i][j-1]==0)p++;
                    if(j== col-1||a[i][j+1]==0)p++;//right
                }
            }
        }
        return p;
    }
}