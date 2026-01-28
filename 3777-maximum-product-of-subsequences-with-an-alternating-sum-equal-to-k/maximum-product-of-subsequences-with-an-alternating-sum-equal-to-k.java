class Solution {
    int[] nums;
    int n, k, limit;
    Map<String, Integer> memo;
    
    public int maxProduct(int[] nums, int k, int limit) {
        this.nums = nums;
        this.n = nums.length;
        this.k = k;
        this.limit = limit;
        this.memo = new HashMap<>();

        if (k < -900 || k > 900) return -1;
        
        return solve(0, -1, 0, 1);
    }

    private String key(int i, int turn, int sum, int product) {
        return i + "," + turn + "," + sum + "," + product;
    }

    private int solve(int i, int turn, int sum, int product) {
        if (product > this.limit) {
            product = this.limit + 1;
        }

        if (i == this.n) {
            return (sum == this.k && product <= this.limit && turn > -1) ? product : -1;
        }

        String memoKey = key(i, turn, sum, product);
        if (this.memo.containsKey(memoKey)) {
            return this.memo.get(memoKey);
        }

        int ans = -1;
        ans = Math.max(ans, solve(i + 1, turn, sum, product));
        if (turn == -1) turn = 0;
        int sign = turn == 0 ? 1 : -1;
        ans = Math.max(ans, solve(i + 1, turn ^ 1, sum + sign * this.nums[i], product * nums[i]));

        this.memo.put(memoKey, ans);
        return ans;
    }
}