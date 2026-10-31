import java.util.*;
class Solution {
    public int findChampion(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            set.add(i);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(i!=j){
                    if(grid[i][j]==1){
                        set.remove(j);
                    }else{
                        set.remove(i);
                    }
                }else{
                    continue;
                }
            }
        }
        int ans=set.iterator().next();
        return ans;
    }
}