class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0) list.add(nums[i]);
            else list1.add(nums[i]);
        }
        Collections.sort(list);
        Collections.sort(list1,Collections.reverseOrder());
        int e=0,o=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0) nums[i]=list.get(e++);
            else nums[i]=list1.get(o++);
        }
        return nums;

        
    }
}