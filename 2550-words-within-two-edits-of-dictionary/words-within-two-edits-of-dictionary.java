class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String> list=new ArrayList<>();
        for(String s : queries)
        {
            for(String q : dictionary)
            {
                if(isTrue(s,q))
                {
                    list.add(s);
                    break;
                }
            }

        }
        return list;
        
    }
    
            public boolean isTrue(String s, String q)
            {
                int diff=0;
                for(int i=0;i<s.length();i++)
                {
                    
                        if(s.charAt(i)!=q.charAt(i))
                        {
                            diff++;
                        }
                        if(diff>2) return false;
                    
                }
                return true;
            }
}