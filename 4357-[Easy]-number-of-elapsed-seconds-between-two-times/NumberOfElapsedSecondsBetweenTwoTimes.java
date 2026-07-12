class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int hour = (Integer.parseInt(end[0]) - Integer.parseInt(start[0])) * 60 * 60;
        int min = (Integer.parseInt(end[1]) - Integer.parseInt(start[1])) * 60;
        int sec = Integer.parseInt(end[2]) - Integer.parseInt(start[2]);

        return hour + min + sec;
    }
}