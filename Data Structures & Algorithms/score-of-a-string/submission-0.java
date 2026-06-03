class Solution {
    public int scoreOfString(String s) {
        int sc1 = 0; int sc2 = 0; int score = 0;

        for (int i = 0; i < s.length()-1; i++){
            sc1 = (int)(s.charAt(i));
            sc2 = (int)(s.charAt(i+1));
            score += Math.abs(sc1-sc2);
        }

        return score;
    }
}