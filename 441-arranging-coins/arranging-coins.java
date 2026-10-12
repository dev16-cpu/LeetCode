class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int c=0;
        int sum=n;
        while(sum-i>=0)
        {
            sum-=i;
            i++;
            c++;
        }
        return c;
        
    }
}