class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
        map.put(0,1);
        int cumSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            cumSum+=nums[i];
            int rem=cumSum%k;
            if(rem<0)
                rem+=k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}