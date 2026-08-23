class Solution {
    public boolean sumGame(String num) {
        int rsum=0;
        int lsum=0;
        int h=num.length()/2;
        int rc=0;
        int lc=0;
        for(int i=0;i<h;i++)
        {
            if(num.charAt(i)=='?') lc++;
            else lsum+= num.charAt(i) - '0';
        }
        for(int i=h;i<num.length();i++)
        {
             if(num.charAt(i)=='?') rc++;
            else rsum+=num.charAt(i) - '0';
        }
        System.out.print(rsum);
        if((lc+rc)%2!=0) return true;
        //if(lsum==rsum) return false;
        return 2 * (lsum - rsum) != 9 * (rc - lc);
    }
}