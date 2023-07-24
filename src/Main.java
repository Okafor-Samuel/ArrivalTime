
public class Main {
            public static String calculateArrivalTime(int arrivalTime, int delayedTime) {
                int totalHours = arrivalTime + delayedTime;
                if (totalHours >= 24) {
                    totalHours %= 24;
                }
                String formattedTime = String.format("%02d:00", totalHours);
                return formattedTime;
            }

            public static void main(String[] args) {
                int arrivalTime = 8;
                int delayedTime = 4;
                String trainArrivalTime = calculateArrivalTime(arrivalTime, delayedTime);
                System.out.println("Train Arrival Time: " + trainArrivalTime);
            }

}
/*
You are given a positive integer arrivalTime denoting the arrival
time of a train in hours, and another positive integer delayedTime
denoting the amount of delay in hours.

Return the time when the train will arrive at the station.

Note that the time in this problem is in 24-hours format.



Example 1:

Input: arrivalTime = 15, delayedTime = 5
Output: 20
Explanation: Arrival time of the train was 15:00 hours. It
is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).
Example 2:

Input: arrivalTime = 13, delayedTime = 11
Output: 0
Explanation: Arrival time of the train was 13:00 hours. It is
delayed by 11 hours. Now it will reach at 13+11=24 (Which is
denoted by 00:00 in 24 hours format so return 0).
 */