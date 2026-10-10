class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0,count=0,rem=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            rem=((prefix%k)+k)%k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}