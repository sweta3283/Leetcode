class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] sortedArray = Arrays.stream(arr).distinct().sorted().toArray();
        for(int i=0; i<sortedArray.length;i++){
            map.put(sortedArray[i],i+1);
        }
        for(int i=0; i<arr.length;i++){
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}