class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int current=nums2[i];
            while(!st.isEmpty()&&st.peek()<=current){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(current,-1);
            }
            else{
                map.put(current,st.peek());
            }
            st.push(current);
        }
        int[]arr=new int[nums1.length];
        for(int i=0;i<arr.length;i++){
           arr[i]= map.get(nums1[i]);
        }
        return arr;
    }
}