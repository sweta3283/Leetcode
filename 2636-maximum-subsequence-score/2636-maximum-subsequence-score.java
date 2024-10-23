class Solution {
    record Pair(int a, int b) {

    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(nums1[i], nums2[i]);
        }
        long sum = 0;
        long max = 0;
        Arrays.sort(pairs, (x, y) -> y.b - x.b);
        Queue<Integer> pq = new PriorityQueue<>(k + 1);
        for (Pair p : pairs) {
            pq.offer(p.a);
            sum = sum + p.a;
             if (pq.size() > k) {
                sum = sum - pq.poll();
            }
            if (pq.size() == k) {
                long res = sum * p.b;
                max = Math.max(max, res);
            }
           
        }
        return max;
    }
}