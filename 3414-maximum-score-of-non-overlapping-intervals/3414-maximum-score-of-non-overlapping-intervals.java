
import java.util.*;

class Solution {

    int[][] intervals;
    int n;

    int[] starts;

    Result[][] dp;

    public int[] maximumWeight(List<List<Integer>> intervalsList) {

        n = intervalsList.size();

        intervals = new int[n][4];

        for (int i = 0; i < n; i++) {

            intervals[i][0] = intervalsList.get(i).get(0);
            intervals[i][1] = intervalsList.get(i).get(1);
            intervals[i][2] = intervalsList.get(i).get(2);

            intervals[i][3] = i;
        }

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }

            return Integer.compare(a[1], b[1]);
        });

        starts = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
        }

        dp = new Result[n + 1][5];

        return solve(0, 4).indices;
    }

    class Result {

        long score;
        int[] indices;

        Result(long score, int[] indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    Result solve(int i, int k) {

        if (i == n || k == 0) {
            return new Result(0, new int[0]);
        }

        if (dp[i][k] != null) {
            return dp[i][k];
        }

        // Skip current interval
        Result skip = solve(i + 1, k);

        // Take current interval
        int next = findNext(intervals[i][1]);

        Result nextResult = solve(next, k - 1);

        long takeScore =
            intervals[i][2] + nextResult.score;

        int[] takeIndices =
            new int[nextResult.indices.length + 1];

        takeIndices[0] = intervals[i][3];

        for (int j = 0; j < nextResult.indices.length; j++) {
            takeIndices[j + 1] = nextResult.indices[j];
        }

        Arrays.sort(takeIndices);

        Result take = new Result(takeScore, takeIndices);

        Result best;

        if (take.score > skip.score) {
            best = take;
        }
        else if (take.score < skip.score) {
            best = skip;
        }
        else {

            if (compare(take.indices, skip.indices) < 0) {
                best = take;
            }
            else {
                best = skip;
            }
        }

        dp[i][k] = best;

        return best;
    }

    int findNext(int end) {

        int low = 0;
        int high = n;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (starts[mid] <= end) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }

    int compare(int[] a, int[] b) {

        int len = Math.min(a.length, b.length);

        for (int i = 0; i < len; i++) {

            if (a[i] < b[i]) {
                return -1;
            }

            if (a[i] > b[i]) {
                return 1;
            }
        }

        return Integer.compare(a.length, b.length);
    }
}