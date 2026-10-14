class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=nums[nums.length-1]){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        
        return nums[ans];

        
    }
}