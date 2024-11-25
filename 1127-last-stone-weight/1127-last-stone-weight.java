class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int sec = pq.poll();

            if (first != sec) {
                sec = first - sec;
                pq.offer(sec);
            }
        }
        if (pq.isEmpty()) {
            return 0;
        } else
            return pq.poll();

    }
}