class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        
        s = s.toLowerCase();
        Boolean flag = true;
        int i = 0; 
        int j = s.length() - 1;

        while (i < j){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)){
                flag = false;
                break;
            }
            i++; j--;
        }
        System.out.println(s);

        return flag;
    }
}