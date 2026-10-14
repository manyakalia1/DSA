class Solution {
    public int findMin(int[] arr) {
         int left=0;
        int right=arr.length-1;
        int min=arr[0];
      
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[left]<=arr[mid]){
                if(arr[left]<min){
                    min=arr[left];
                   
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(arr[mid]<min){
                    min=arr[mid];
                  
                }
                else{
                    right=mid-1;
                }
            }
        }
        return min;
    }
}