class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for (int hr : hours) {
            int rem = hr % 24;
            int compl = (24 - rem) % 24;
            if (map.containsKey(compl)) {
                count = count + map.get(compl);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
          //  System.out.println(map);
        }
        return count;
    }
}