class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        if (s.length() > t.length()) {
            return false;
        }
        if (s == "" || s.length() == 0 || s == null) {
            return true;
        }
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
                System.out.println(count);
            }
            if (count == s.length()) {
                return true;
            }
        }
        return false;
    }
}