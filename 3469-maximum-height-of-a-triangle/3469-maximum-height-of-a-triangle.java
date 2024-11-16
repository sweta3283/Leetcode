class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(helper(red, blue), helper(blue, red));
    }

    private int helper(int red, int blue) {
        int count = 0;
        int i = 1;
        while (true) {
            if (i % 2 == 0) {
                if (red >= i) {
                    red = red - i;
                } else {
                    break;
                }
            } else {
                if (blue >= i) {
                    blue = blue - i;
                } else {
                    break;
                }
            }
            count++;
            i++;
        }
        return count;
    }
}