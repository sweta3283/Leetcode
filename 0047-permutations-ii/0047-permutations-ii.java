class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        List<Integer> out = null;
        int index = 0;
        solve(nums, out, index, map);
        for (List<Integer> key : map.keySet()) {
            ans.add(key);
        }
        return ans;
    }

    public void solve(int[] nums, List<Integer> out, int index, HashMap<List<Integer>, Integer> map) {
        // base case
        if (index >= nums.length) {
            out = IntStream.of(nums).boxed().collect(Collectors.toList());
            if (!map.containsKey(out)) {
                map.put(out, 1);
            }

        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            solve(nums, out, index + 1, map);
            swap(nums, index, i);
        }

    }

    private int[] swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return nums;
    }

}