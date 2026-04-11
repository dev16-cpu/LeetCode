class Solution {
    public int minAllOneMultiple(int k) {
        int no=0;
        for(int i=1;i<=k;i++)
        {
            no=(no*10+1)%k;
            if(no==0) return i;
        }
        return -1;
        
    }
}