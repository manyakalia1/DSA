class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer num:map.keySet()){
            int freq=map.get(num);
            if(freq==1){
                return num;
            }
        }
        return 0;
    }
}