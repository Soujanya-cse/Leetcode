class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;  // This will track the position to place the next non-zero element
        
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        // After moving all non-zero elements, set the remaining elements to 0
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}