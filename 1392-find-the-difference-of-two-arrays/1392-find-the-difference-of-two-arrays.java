
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int val1 : nums1) {
            set1.add(val1);
        }
        for (int val : nums2) {
            set2.add(val);
        }
        for (int val1 : set1) {
            if (!set2.contains(val1)) {
                result.get(0).add(val1);
            }
        }
        for (int val2 : set2) {
            if (!set1.contains(val2)) {
                result.get(1).add(val2);
            }
        }

        return result;
    }
}