class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int maxEnd = nums[0];

        for (int i = 1; i < nums.length; i++){
            maxEnd = Math.max(nums[i], nums[i]+maxEnd);

            ans = Math.max(ans, maxEnd);
        }

        return ans;
    }
}
