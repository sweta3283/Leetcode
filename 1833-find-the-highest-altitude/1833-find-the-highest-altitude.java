class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prefixSum = 0;
        for (int i = 0; i < gain.length; i++) {
            prefixSum = prefixSum + gain[i];
            max = Math.max(max, prefixSum);
        }
        return max;
    }
}