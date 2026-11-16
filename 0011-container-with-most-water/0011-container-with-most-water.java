class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int area=0;
        while(i<j){
            int min=Math.min(height[i],height[j]);
            int width=Math.abs(i-j);
            area=Math.max(area,width*min);
            if(height[i]==min){
                i++;
            }else if(height[j]==min){
                j--;
            }
        }
        return area;
    }
}