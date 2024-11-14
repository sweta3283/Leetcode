class Solution {
    public int[] asteroidCollision(int[] arr) {
        // when stack is empty or asteroids are positive
        // add it to stack
        // when stack is not empty and asteroid coming is negative and top is also
        // negative
        // add the asteroid to stack
        Stack<Integer> stack = new Stack();
        for (int asteroid : arr) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty()) {
                    int top = stack.peek();
                    if (top < 0) {
                        stack.push(asteroid);
                        break;
                    } else {
                        if (asteroid < 0) {
                            int absVal = Math.abs(asteroid);
                            if (absVal > top) {
                                stack.pop();
                                if (stack.isEmpty()) {
                                    stack.push(asteroid);
                                    break;
                                }
                            } else if (absVal == top) {
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
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}