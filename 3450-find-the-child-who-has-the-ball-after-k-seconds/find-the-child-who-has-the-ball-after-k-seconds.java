class Solution {
    public int numberOfChild(int n, int k) {
        int pos = 0;       
        int r = 1;       

        for (int i = 0; i < k; i++) {
            pos+= r;
            if (pos == n - 1) {
                r = -1;
            } else if (pos == 0) {
                r= 1;
            }
        }

        return pos;
    }
}
