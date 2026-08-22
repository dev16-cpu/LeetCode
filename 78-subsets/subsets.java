class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        int ind=0;
        generate(list,nums,ind,list1);
        return list;
    }
    public void generate(List<List<Integer>>list,int[] nums,int idx,List<Integer>list1)
    {
        if(idx==nums.length)
        {
            list.add(new ArrayList<>(list1));
            return;
        }
        generate(list,nums,idx+1,list1);
        list1.add(nums[idx]);
        generate(list,nums,idx+1,list1);
       

         list1.remove(list1.size() - 1);
    }
}