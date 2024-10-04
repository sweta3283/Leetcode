class Solution {
    public int minSubarray(int[] nums, int p) {
        // 3,1,4,2
        // main equation = (totalsum-(p[j]-p[i]))%p =0;
        // p[j] = (totalsum -p[i]+p)%p
        int total_sum = 0;
        int ans = nums.length;
        for (int num : nums) {
            total_sum = (total_sum + num) % p;
        }
        int mod = total_sum % p;
        if (mod == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix_sum = (prefix_sum + nums[i]) % p;
            int check = (prefix_sum - mod + p) % p;
            if (map.containsKey(check)) {
                ans = Math.min(ans, i - map.get(check));
            }
            map.put(prefix_sum, i);
        }
        if (ans == nums.length) {
            return -1;
        }
        return ans;

    }
}