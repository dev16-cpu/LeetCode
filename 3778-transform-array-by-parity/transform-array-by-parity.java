class Solution {
    public int[] transformArray(int[] nums) {
        int index=0;
        for(int num:nums)
        {
            if(num%2==0) nums[index++]=0;
            else nums[index++]=1;
        }
        Arrays.sort(nums);
        return nums;
        
    }
}