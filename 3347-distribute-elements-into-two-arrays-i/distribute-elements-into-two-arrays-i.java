class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> sc = new Stack<>();
        Stack<Integer> sc1 = new Stack<>();

        sc.push(nums[0]);
        sc1.push(nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (sc.peek() > sc1.peek())
                sc.push(nums[i]);
            else
                sc1.push(nums[i]);
        }

        int[] result = new int[nums.length];
        int k = 0;

        while (!sc.isEmpty())
            result[k++] = sc.remove(0);

        while (!sc1.isEmpty())
            result[k++] = sc1.remove(0);

        return result;
    }
}