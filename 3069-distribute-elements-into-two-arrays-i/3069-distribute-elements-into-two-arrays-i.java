class Solution {
    public int[] resultArray(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int last1 = nums[0];
        int last2 = nums[1];
        result[left++] = nums[0];
        result[right--] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (last1 > last2) {
                result[left++] = nums[i];
                last1 = nums[i];
            } else {
                result[right--] = nums[i];
                last2 = nums[i];
            }
        }
        int l = left;
        int r = nums.length - 1;

        while (l < r) {
            int temp = result[l];
            result[l] = result[r];
            result[r] = temp;
            l++;
            r--;
        }
        return result;
    }
}