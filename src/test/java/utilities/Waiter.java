package utilities;

public class Waiter {
    public static void pause(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception ignored){}
    }
}
