class Solution {
    public int fib(int n) {
        
         return series(n);
    }
    public static int series(int a)
    {
        if(a==0 || a==1) return a;
        return series(a-1)+series(a-2);
    }
}