class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()) return false;
        String arr[]=s.split("");

        String arr1[]=t.split("");
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].equals(arr1[i])) return false;
        }
        return true;
        
    }
}