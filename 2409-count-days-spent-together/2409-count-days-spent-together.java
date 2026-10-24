
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        String[] months = {"31", "28", "31", "30", "31", "30",
                           "31", "31", "30", "31", "30", "31"};

        int a1 = getDays(arriveAlice);
        int a2 = getDays(leaveAlice);
        int b1 = getDays(arriveBob);
        int b2 = getDays(leaveBob);

        int start = Math.max(a1, b1);
        int end = Math.min(a2, b2);

        return Math.max(0, end - start + 1);
    }

    private int getDays(String date) {
        int[] days = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}

