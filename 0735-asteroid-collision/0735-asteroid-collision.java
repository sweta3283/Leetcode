class Solution {
    public int[] asteroidCollision(int[] asteriods) {
        int n = asteriods.length;
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < n; i++) {
            // case when stack is empty or positive element then blind insertion
            if (stack.isEmpty() || asteriods[i] > 0) {
                stack.push(asteriods[i]);
            } else {
                // case when stack is not empty
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    // top is negative then blindly add incoming
                    if (top < 0) {
                        stack.push(asteriods[i]);
                        break;
                    } else {
                        if (asteriods[i] < 0) {
                            int absoluteVal = Math.abs(asteriods[i]);
                            if (absoluteVal > top) {
                                stack.pop();
                                if (stack.isEmpty()) {
                                    stack.push(asteriods[i]);
                                    break;
                                }
                            } else if (absoluteVal == top) {
                                stack.pop();
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int len = stack.size();
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}