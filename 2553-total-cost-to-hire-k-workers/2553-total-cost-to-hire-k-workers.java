class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        if (costs.length == 0 || costs.length < k || costs.length < candidates) {
            return 0;
        }
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int l = 0;
        int r = costs.length - 1;
        long sum = 0L;
        while (k > 0) {
            while (pq1.size() < candidates && l <= r ) {
                pq1.offer(costs[l++]);
            }
            while (pq2.size() < candidates && l <= r ) {
                pq2.offer(costs[r--]);
            }
            if (!pq1.isEmpty() && !pq2.isEmpty()) {
                if (pq1.peek() <= pq2.peek()) {
                    sum = sum + pq1.poll();
                } else {
                    sum = sum + pq2.poll();
                }
            } else if (!pq1.isEmpty()) {
                sum = sum + pq1.poll();
            } else {
                sum = sum + pq2.poll();
            }
            k--;
        }
        return sum;
    }
}