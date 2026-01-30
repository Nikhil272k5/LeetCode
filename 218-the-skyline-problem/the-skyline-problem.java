class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {

        TreeMap<Integer,List<int[]>> sweepPoints = new TreeMap<>();
        for (int[] building: buildings) {
            List<int[]> atPt = sweepPoints.get(building[0]);
            if (atPt == null) {
                // Rank these by height
                atPt = new ArrayList<>();
                sweepPoints.put(building[0], atPt);
            }            
            atPt.add(building);

            atPt = sweepPoints.get(building[1]);
            if (atPt == null) {
                atPt = new ArrayList<>();
                sweepPoints.put(building[1], atPt);
            }
            atPt.add(building);
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[2] - a[2]);
        List<List<Integer>> result = new ArrayList<>();

        int prevHt = 0;
        for (Map.Entry<Integer,List<int[]>> e: sweepPoints.entrySet()) {
            for (int[] pt: e.getValue()) {
                if (pt[0] == e.getKey()) {
                    // starting
                    q.add(pt);
                }
            }
            int[] peeked = q.peek();
            int maxEnding = 0;
            int maxEndingPos = -1;
            while (peeked[1] <= e.getKey() && !q.isEmpty()) {
                // old. Drop them
                q.poll();
                if (! q.isEmpty()) {
                    peeked = q.peek();
                    if (peeked[1] > maxEnding) {
                        maxEnding = peeked[2];
                        maxEndingPos = peeked[1];
                    }
                } else {
                    break;                        
                }
            }
            if (q.isEmpty()) {
                // Nothing here.
                if (prevHt == 0) {
                  // This means there is a gap between buildings
                  result.add(List.of(maxEndingPos, maxEnding));
                }
                prevHt = 0;
                result.add(List.of(e.getKey(), 0));
            } else if (peeked[2] != prevHt) {
                result.add(List.of(e.getKey(), peeked[2]));
                prevHt = peeked[2];            
            }
        }
        return result;
    }
}