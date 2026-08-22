class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        valid(n,0,0,"",list);
        return list;
    }
    public static void valid(int n,int left,int right,String s,List<String> list)
    {
        if(right==n)
        {
            list.add(s);
            return;
        }
        if(left < n) valid(n,left+1,right,s+"(",list);
        if(right<left)valid(n,left,right+1,s+=")",list);

    }
}