class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st= new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
           long val = nums[i];

            while(!st.isEmpty() && st.peek() == val) {
                     st.pop();
                    val = val + val; // merge
                }

                st.push(val);
        }
        List<Long> list=new ArrayList<>();
        while(!st.isEmpty())
        {
            list.add(st.pop());
        }
        Collections.reverse(list);
        return list;
        
    }
}