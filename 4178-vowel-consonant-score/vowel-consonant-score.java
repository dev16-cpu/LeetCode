class Solution {
    public int vowelConsonantScore(String s) {
        StringBuilder sb= new StringBuilder(s);
        int v=0,c=0;
        for(int i=0;i<sb.length();i++)
        {
            char ch= Character.toLowerCase(sb.charAt(i));
            if(ch>='a' && ch<='z')
            {
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 {
                    v++;
                 }
                 else c++;
            }
        }
        if(c==0)  return 0;
        return v/c;
        
    }
}