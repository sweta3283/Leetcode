class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        System.out.println(l + " : " + r);
        if (l == r || r < l) {
            return true;
        } else
            return false;
    }
}