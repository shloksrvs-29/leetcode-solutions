import java.util.HashSet;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days = 0;
        int[] alice = new int[365];
        int[] bob = new int[365];

        int alice_month_arrive = Integer.parseInt(arriveAlice.substring(0, 2));
        int alice_day_arrive = Integer.parseInt(arriveAlice.substring(3, 5));
        int alice_month_leave = Integer.parseInt(leaveAlice.substring(0, 2));
        int alice_day_leave = Integer.parseInt(leaveAlice.substring(3, 5));

        int bob_month_arrive = Integer.parseInt(arriveBob.substring(0, 2));
        int bob_day_arrive = Integer.parseInt(arriveBob.substring(3, 5));
        int bob_month_leave = Integer.parseInt(leaveBob.substring(0, 2));
        int bob_day_leave = Integer.parseInt(leaveBob.substring(3, 5));

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aliceStart = alice_day_arrive;
        int aliceEnd = alice_day_leave;
        int bobStart = bob_day_arrive;
        int bobEnd = bob_day_leave;

        for (int i = 0; i < alice_month_arrive - 1; i++)
            aliceStart += monthDays[i];

        for (int i = 0; i < alice_month_leave - 1; i++)
            aliceEnd += monthDays[i];

        for (int i = 0; i < bob_month_arrive - 1; i++)
            bobStart += monthDays[i];

        for (int i = 0; i < bob_month_leave - 1; i++)
            bobEnd += monthDays[i];

        int k = 0;
        for (int i = aliceStart; i <= aliceEnd; i++)
            alice[k++] = i;

        k = 0;
        for (int i = bobStart; i <= bobEnd; i++)
            bob[k++] = i;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int num : alice) {
            if (num != 0)
                set.add(num);
        }

        for (int num : bob) {
            if (num != 0 && set.contains(num))
                result.add(num);
        }

        days = result.size();
        return days;
    }
}