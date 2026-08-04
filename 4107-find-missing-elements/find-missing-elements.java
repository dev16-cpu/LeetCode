class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
           ArrayList<Integer> list2= new ArrayList<>();
        Arrays.sort(nums);
      
        for(int i=nums[0];i<=nums[nums.length-1];i++)
        {
            list.add(i);
        }
          Collections.sort(list);

        for(int i=0;i<nums.length;i++)
        {
            list1.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            if(!list1.contains(list.get(i)))
            {
                list2.add(list.get(i));
            }
        }
        return list2;
        
    }
}