class Solution {
    void segregate0and1(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            if (arr[p1] == 0) {
                p1++;
            }
            else if (arr[p2] == 1) {
                p2--;
            }
            else {
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
        }
    }
}