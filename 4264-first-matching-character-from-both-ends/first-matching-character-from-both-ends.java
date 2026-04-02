class Solution {
    public int firstMatchingIndex(String s) {
        if(s.length()==1) return 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-1-i))
            {
                return i;
            }
        }
        return -1;
        
    }
}