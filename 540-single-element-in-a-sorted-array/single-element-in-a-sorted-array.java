class Solution {
    public int singleNonDuplicate(int[] nums) {
        int single=0;
        for(int num : nums)
        {
            single^=num;
        }
        return single;
        
    }
}