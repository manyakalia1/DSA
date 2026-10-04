class Solution {
    public int characterReplacement(String s, int k) {
        int maxlength=0,left=0,maxFreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(maxFreq,map.get(s.charAt(right)));
            while((right-left+1)-maxFreq>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}