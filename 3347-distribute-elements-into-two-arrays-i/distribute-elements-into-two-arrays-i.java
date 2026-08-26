class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int n1 = 0;
        int n2 = 0;

        arr1[n1++] = nums[0];
        arr2[n2++] = nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (arr1[n1 - 1] > arr2[n2 - 1]) {
                arr1[n1++] = nums[i];
            } else {
                arr2[n2++] = nums[i];
            }
        }

        int[] result = new int[nums.length];
        int k = 0;

        for (int i = 0; i < n1; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}