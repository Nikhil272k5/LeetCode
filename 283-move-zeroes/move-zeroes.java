class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0; // pointer for the position to put the next non-zero element

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
