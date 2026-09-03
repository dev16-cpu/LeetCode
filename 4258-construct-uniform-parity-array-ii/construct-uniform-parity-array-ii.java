class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=Integer.MAX_VALUE;
        for(int x: nums1)
        {
            if(x%2!=0 && x<odd) odd=x;
        }
        if(odd == Integer.MAX_VALUE) {
            return true;
        }
        for(int x : nums1)
        {
            if(x<odd && x%2==0) return false;
        }
        return true;
        
    }
}