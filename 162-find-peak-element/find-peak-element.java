class Solution {
    public int findPeakElement(int[] nums) {
      
   
        // Write your code here
        int left=0;
        int right=nums.length-1;
        int ans=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
                ans=left;
            }
            else{
                right=mid;
            }
        }
        return ans;
    

    }
}