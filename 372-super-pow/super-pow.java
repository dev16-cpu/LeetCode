class Solution {
    public int superPow(int a, int[] b) {
        a=a%1337;
        int ans=1;
        for(int i=0;i<b.length;i++)
        {
            ans=pow(ans,10)*pow(a,b[i])%1337;
        }
        return ans;
    }
     public static int pow(int a,int x)
    {
        if(x==0) return 1;
        return a*pow(a,x-1)%1337;
    }
  
}