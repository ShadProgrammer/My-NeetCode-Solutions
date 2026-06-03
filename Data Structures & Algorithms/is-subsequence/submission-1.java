class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        StringBuilder sb = new StringBuilder(s);        // acts as stack
        int sbIndex = 0;

        for (int i = 0; i < t.length(); i++){
            if (sb.length() == 0){
                break;
            }
            if (sb.charAt(sbIndex) == t.charAt(i)){
                sb.deleteCharAt(sbIndex);
            }
        }

        if (sb.length() == 0){
            return true;
        }
        return false;
    }
}