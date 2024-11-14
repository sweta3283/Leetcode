class Solution {
    public String decodeString(String s) {
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> stacSB = new Stack<>();
        int digit = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digit = digit * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(digit);
                digit = 0;
                stacSB.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int num = stack.pop();
                StringBuilder temp = sb;
                sb = stacSB.pop();
                while (num-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}