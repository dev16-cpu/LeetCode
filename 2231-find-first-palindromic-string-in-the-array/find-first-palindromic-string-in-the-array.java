class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String a= new StringBuilder(words[i]).reverse().toString();
            if(a.equals(words[i])) return a;
        }
        return "";
        
    }
}