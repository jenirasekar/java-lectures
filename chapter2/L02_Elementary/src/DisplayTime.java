public class DisplayTime {
    public static void main(String[] args) {
        int time;
        int second;
        int minute;
        int remaining_seconds;

        time = 87;
        second = 60;

        minute = time / second;
        remaining_seconds = time % second;

        System.out.println("87 seconds equals to " + minute + " minute(s)");
        System.out.println("and the remaining second is " + remaining_seconds + " seconds");
    }
}
