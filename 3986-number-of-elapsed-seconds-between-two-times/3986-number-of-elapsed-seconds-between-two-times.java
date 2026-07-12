class Solution 
{
    public int secondsBetweenTimes(String startTime, String endTime) 
    {
        String start[] = startTime.split(":");
        String end[] = endTime.split(":");

        int s1 = Integer.parseInt(start[2]);
        int s2 = Integer.parseInt(end[2]);

        int m1 = Integer.parseInt(start[1]);
        int m2 = Integer.parseInt(end[1]);

        int h1 = Integer.parseInt(start[0]);
        int h2 = Integer.parseInt(end[0]);

        return (h2-h1)*3600+(m2 - m1)*60 + (s2 -s1);
    }
}