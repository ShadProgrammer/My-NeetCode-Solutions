class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            if (prefixSum == k){
                ans++;
            }

            if (map.containsKey(prefixSum-k)){
                ans += map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return ans;
    }
}