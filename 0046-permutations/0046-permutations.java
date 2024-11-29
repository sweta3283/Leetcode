class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> out = null;
        int index = 0;
        solve(nums, out,index, ans);
        return ans;
    }

    public void solve(int[] nums, List<Integer> out, int index, List<List<Integer>> ans) {
        // base case
        if (index >= nums.length) {
           out = IntStream.of(nums).boxed().collect(Collectors.toList());
            ans.add(out);
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            solve(nums, out, index + 1, ans);
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