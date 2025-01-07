class Solution {
    public void nextPermutation(int[] a) {
        int n = a.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        } else {
            for (int i = n - 1; i > idx; i--) {
                if (a[i] > a[idx]) {
                    int temp = a[i];
                    // System.out.println(a[i]);
                    // System.out.println(a[idx]);
                    a[i] = a[idx];
                    a[idx] = temp;
                    break;
                }
            }

            int left = idx + 1;
            int right = n - 1;
            while (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
    }
}