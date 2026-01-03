class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        int n = friends.length;
        int[] res = new int[n];
        int r = 0;

        // store friends in HashSet for fast lookup
        HashSet<Integer> set = new HashSet<>();
        for (int f : friends) {
            set.add(f);
        }

        // traverse order array
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                res[r++] = order[i];
            }
        }

        return res;
    }
}
