class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int freq[]=new int[101];
        for(int num:nums)
        {
            freq[num]++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]%k==0)
            {
                sum+=freq[i]*i;
            }
        }
        return sum;
        
    }
}