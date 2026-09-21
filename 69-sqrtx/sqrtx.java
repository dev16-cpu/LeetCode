import java.math.*;
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        for(int i=0;i<=x/2+1;i++)
        {
         
            if((long)i*i>x) return i-1;
        }
        return 1;
        
    }
}