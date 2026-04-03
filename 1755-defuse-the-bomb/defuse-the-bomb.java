class Solution {
    public int[] decrypt(int[] code, int k) {
        int sum[]=new int[code.length];
        int index=0;
        for(int i=0;i<code.length;i++)
        {
            int sum2=0;
            for(int j=1;j<=Math.abs(k);j++)
            {
                if(k>0) sum2+=code[(i+j)%code.length];
                else  sum2+=code[(i-j+code.length)%(code.length)];

            }
            sum[i]=sum2;

        }
        return sum;

        
    }
}