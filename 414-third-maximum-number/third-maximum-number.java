class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.last();   // maximum
        }

        set.pollLast(); // remove max
        set.pollLast(); // remove 2nd max

        return set.last(); // 3rd max
    }
}
