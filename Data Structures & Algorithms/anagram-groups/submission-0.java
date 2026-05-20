class Solution {
    public static Boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            if (!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), 1);
            }
            else{
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++){

            if (map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);

                if (map.get(s2.charAt(i)) < 0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        if (strs.length == 0){
            return ans;
        }

        int[] flags = new int[strs.length];

        for (int i = 0; i < strs.length; i++){
            List<String> group = new ArrayList<>();
            if (flags[i] != 1){
                group.add(strs[i]);
                flags[i] = 1;
            }

            for (int j = i+1; j < strs.length; j++){
                if (flags[j] == 0 && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    flags[j] = 1;
                }
            }

            if (!group.isEmpty()) {
                ans.add(group);
            }
        }

        return ans;
    }
}
