class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String ans = "";
        // " hello world "
        int l = 0;
        while (l <= s.length() - 1) {

            if (s.charAt(l) != ' ') {
                temp = temp + s.charAt(l);
            } else {
                if (temp != "") {
                    if (ans != "") {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;

                    }
                }
                temp = "";
            }
            l++;

        }
        if (temp != "") {
            if (ans != "") {
                ans = temp + " " + ans;
            } else {
                ans = temp;

            }
        }
        return ans;
    }
}