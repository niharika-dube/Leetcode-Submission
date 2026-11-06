class Solution {
    public void rotate(int[][] matrix) {
        //step1 ; reverse of a matrix
        //swap matrix

        int n=matrix.length;
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        //step reverse all rows of matrix
        for(int row=0; row<n; row++){
            int starcol =0;
            int endcol =n-1;
            while(starcol<endcol){
                int temp = matrix[row][starcol];
                matrix[row][starcol]=matrix[row][endcol];
                matrix[row][endcol]=temp;

                starcol++;
                endcol--;
            }
        }
    }
}