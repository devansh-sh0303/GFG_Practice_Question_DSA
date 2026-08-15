class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int[] ans=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int row_sum=0;
            for(int j=0;j<mat[0].length;j++){
                row_sum=row_sum+mat[i][j];
                ans[i]=row_sum;
            }
        }return ans;
        
    }
}