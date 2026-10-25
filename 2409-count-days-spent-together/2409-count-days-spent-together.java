class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] dates = {0,31,59,90,120,151,181,212,243,273,304,334,365};
        int aa = cal_day(arriveAlice,dates);
        int la = cal_day(leaveAlice,dates);
        int ab = cal_day(arriveBob,dates);
        int lb = cal_day(leaveBob,dates);
        return Math.max(0,Math.min(la,lb)-Math.max(aa,ab)+1);
    }
    public static int cal_day(String day,int[] dates){
        int month = Integer.parseInt(day.substring(0,2));
        int date = Integer.parseInt(day.substring(3));
        return dates[month-1]+date;

    }
}