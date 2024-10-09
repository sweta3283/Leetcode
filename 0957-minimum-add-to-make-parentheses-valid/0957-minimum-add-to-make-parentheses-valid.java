class Solution {
    public int minAddToMakeValid(String s) {
        if (s == null) {
            return 0;
        }
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}