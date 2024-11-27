class Solution {
    public boolean isPalindrome(String str) {
        int l = 0;
        int r = str.length() - 1;
        str = str.toLowerCase();
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(str.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(str.charAt(r))) {
                r--;
            }
            if ((str.charAt(l)) == (str.charAt(r))) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}