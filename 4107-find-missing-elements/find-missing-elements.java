class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = nums[0]; i <= nums[nums.length - 1]; i++) {
            list.add(i);
        }

        for (int num : nums) {
            set.add(num);
        }

        for (int num : list) {
            if (!set.contains(num)) {
                list2.add(num);
            }
        }

        return list2;
    }
}