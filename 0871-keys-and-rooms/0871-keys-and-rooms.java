class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> firstEl = rooms.get(0);
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        for (Integer first : firstEl) {
            queue.offer(first);

        }
        while (!queue.isEmpty()) {
            int data = queue.poll();
            visited[data] = true;
            System.out.println(data + " : " + visited[data]);

            List<Integer> adjList = rooms.get(data);
            for (int i = 0; i < adjList.size(); i++) {
                if (!visited[adjList.get(i)]) {
                    queue.offer(adjList.get(i));
                    visited[adjList.get(i)] = true;
                }
            }
        }
        for (int i = 0; i < visited.length; i++) {
            System.out.println(visited[i]);
            if (!visited[i])
                return false;
        }
        return true;
    }
}