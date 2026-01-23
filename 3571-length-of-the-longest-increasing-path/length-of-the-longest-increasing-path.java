class Solution {
    public int maxPathLength(int[][] coordinates, int k) {
        int n = coordinates.length;
        int x_val = coordinates[k][0];
        int y_val = coordinates[k][1];

        Arrays.sort(coordinates, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int[] coord : coordinates) {
            if (coord[0] < x_val && coord[1] < y_val) {
                left.add(coord[1]);
            } else if (coord[0] > x_val && coord[1] > y_val) {
                right.add(coord[1]);
            }
        }

       
        int left_lis = computeLIS(left);
        int right_lis = computeLIS(right);

        return left_lis + right_lis + 1;
    }

    private int lowerBound(List<Integer> list, int target) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public int computeLIS(List<Integer> arr) {
        List<Integer> temp = new ArrayList<>();
        for (int x : arr) {
            int lowerBound = lowerBound(temp, x);
            if (lowerBound == temp.size()) {
                temp.add(x);
            } else {
                temp.set(lowerBound, x);
            }
        }
        return temp.size();
    }
}