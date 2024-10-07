
class Solution {
    public int compress(char[] chars) {
        int index = 0;
        if (chars.length == 1) {
            return 1;
        }

        for (int i = 0; i < chars.length;) {
            char val = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == val) {
                i++;
                count++;
            }
            chars[index++] = val;
            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}