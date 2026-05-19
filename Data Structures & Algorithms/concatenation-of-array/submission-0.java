class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newarr = new int[2*nums.length];

        int i = 0;
        int j = 0;

        for (int key = 0; key < 2; key++){
            while (i < nums.length){
                newarr[j++] = nums[i++];
            }
            i = 0;
        }

        return newarr;
    }
}