class NumMatrix {
    private int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr=new int[matrix.length][matrix[0].length];
        int i=0;
        arr[0][0]=matrix[0][0];
        int sum1=arr[0][0];
        for(int j=1;j<matrix[0].length;j++){
            arr[i][j]=sum1+matrix[i][j];
            sum1=arr[i][j];
        }
        int x=0;
        int sum2=arr[0][0];
        for(int j=1;j<matrix.length;j++){
            arr[j][x]=sum2+matrix[j][x];
            sum2=arr[j][x];
        }
        for(int p=1;p<matrix.length;p++){
            for(int q=1;q<matrix[0].length;q++){
                arr[p][q]=matrix[p][q]+arr[p-1][q]+arr[p][q-1]-arr[p-1][q-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int result=arr[row2][col2];
        if(row1>0){
            result=result-arr[row1-1][col2];
        }
        if(col1>0){
            result-=arr[row2][col1-1];
        }
        if(row1>0 && col1>0){
            result+=arr[row1-1][col1-1];
        }
        return result;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */