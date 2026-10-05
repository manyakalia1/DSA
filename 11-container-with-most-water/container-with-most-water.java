class Solution {
    public int maxArea(int[] height) {
        int maxwater=0,left=0,right=height.length-1;
        int width=0,heights=0;
        while(left<right){
            width=right-left;
            heights=Math.min(height[left],height[right]);
            maxwater=Math.max(maxwater,width*heights);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
        
    }
}