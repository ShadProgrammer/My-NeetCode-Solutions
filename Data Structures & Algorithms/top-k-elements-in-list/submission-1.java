class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for (int i : nums){
            if (!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }

        System.out.println(map);

        int maxKey = 0;
        for (int i = 0; i < k; i++){
            int max = 0;
            for (int key : map.keySet()){
                if (map.get(key) > max){
                    max = map.get(key);
                    maxKey = key;
                }
            }
            ans[i] = maxKey;
            map.remove(maxKey);
        }

        return ans;
    }
}
