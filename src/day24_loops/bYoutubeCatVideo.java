package day24_loops;

public class bYoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds=0;
        System.out.println("starsing Worlds smallest cat \uD83D\uDC08 - BBC");
        while (seconds<=117){
            System.out.println("Watching Youtube video: second: 1");
            seconds++;
            Thread.sleep(2000);
        }
        System.out.println("Finished watching Youtube videos");
    }
}
