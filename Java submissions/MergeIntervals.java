import java.util.LinkedList;
import java.util.Arrays;
class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> LL = new LinkedList<>();
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        for (int[] i : intervals) {
            if (LL.isEmpty() || LL.getLast()[1] < i[0]) {
                LL.add(i);
            }
            else {
                if (!LL.isEmpty() && LL.getLast()[1] >= i[0]) {
                    LL.getLast()[1] = Math.max(LL.getLast()[1], i[1]);
                }
            }
        }
        return LL.toArray(new int[0][]);
    }
}