class Solution {
    public int numberOfChild(int n, int k) {
        int pos = 0;       // start at child 0
        int dir = 1;       // direction: 1 = right, -1 = left

        for (int i = 0; i < k; i++) {
            pos += dir;

            // Bounce back if at the ends
            if (pos == n - 1) {
                dir = -1;
            } else if (pos == 0) {
                dir = 1;
            }
        }

        return pos;
    }
}
