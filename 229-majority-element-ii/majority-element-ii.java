class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int limit= nums.length/3;
        for(int val: set)
        {
            int c=0;
            for(int num:nums)
            {
                if(val==num)
                {
                    c++;
                }
            }
            if(c>limit) list.add(val);
        }
        return list;
        
    }
}