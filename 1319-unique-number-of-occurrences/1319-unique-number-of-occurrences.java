class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer val : map.values()) {
            if (!set.contains(val)) {
                set.add(val);
            } else {
                return false;
            }
        }
        return true;
    }
}