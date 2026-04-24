class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        StringBuilder sb= new StringBuilder(moves);
        int l=0,b=0,r=0;
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else b++;
        }
        return Math.abs(l-r)+b;
        
    }
}