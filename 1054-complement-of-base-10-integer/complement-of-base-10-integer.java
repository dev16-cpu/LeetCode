class Solution {
    public int bitwiseComplement(int n) {
        String a= Integer.toBinaryString(n);
        StringBuilder aq= new StringBuilder();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='0') aq.append('1');
            else aq.append('0');
        }
        return Integer.parseInt(aq.toString(),2);
    }
}