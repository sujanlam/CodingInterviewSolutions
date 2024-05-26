package mix;

import java.util.Arrays;

public class MinRoomsForMeetings {
    public static void main(String[] args) {
        int[][] arr = {{25, 30}, {15, 20}, {15, 25}, {22, 28}};
        System.out.println(minMeetingRooms(arr));
    }

    public static int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int endsItr = 0;
        for (int i = 0; i < starts.length; i++) {
            if (starts[i] < ends[endsItr]) {
                rooms++;
            } else {
                endsItr++;
            }
        }
        return rooms;
    }
}
