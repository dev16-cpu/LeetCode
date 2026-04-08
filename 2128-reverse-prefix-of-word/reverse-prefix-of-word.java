class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int index=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                index= i;
                break;
            }
        }
        for(int i=0;i<=index;i++)
        {
            st.push(word.charAt(i));
        }
        StringBuilder a = new StringBuilder();
        while(st.size()>0) a.append(st.pop());
        for(int i=index+1;i<word.length();i++)
        {
            a.append(word.charAt(i));
        }
        return a.toString();
    }
}