class Solution {
    public boolean checkDivisibility(int n) {
        if(n%(sum(n,0)+pro(n,1))==0) return true;
        return false;
        
    }
    public static int sum(int n,int s)
    {
        if(n==0) return s;
        return sum(n/10,s+=n%10);
    }
    public static int pro(int n,int p)
    {
        if(n==0) return p;
        return pro(n/10,p*=n%10);
    }
}