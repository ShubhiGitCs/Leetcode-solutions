class Solution {
    public int majorityElement(int[] nums) {
        int result=nums[0];
        int count=1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(result==num)
                ++count;
            else
                --count;
            
            if(count==0){
                result=num;
                count=1;
            }
        }
        return result;
    }
}