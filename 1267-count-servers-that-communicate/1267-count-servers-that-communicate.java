class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        int[] ans1=new int[m];
        int[] ans2=new int[n];
        for(int i=0;i<m;i++){
            int count1=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    count1++;
                }
            }
            ans1[i]=count1;
        }
        for(int j=0;j<n;j++){
            int count2=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==1){
                    count2++;
                }
            }
            ans2[j]=count2;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                        if(ans1[i]>1 || ans2[j]>1){
                            count++;
                        }
                }
            }
        }
        return count;
    }
}