class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        boolean a = false, b = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                   if(i==0) a=true;
                   if(j==0) b=true;
                   matrix[0][j] = 0;
                   matrix[i][0] = 0; 
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(a){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(b){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}