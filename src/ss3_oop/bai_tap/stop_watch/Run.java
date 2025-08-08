package ss3_oop.bai_tap.stop_watch;

public class Run {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 1000000000; i++) {
            int x = i * i;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + " ms");
    }
}
