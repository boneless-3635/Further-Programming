package T11.P1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DisplayTimeThread extends Thread{
    @Override
    public void run() {
        while (true) {
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            System.out.println(formatter.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main (String[] args) {
        DisplayTimeThread thread = new DisplayTimeThread();
        thread.start();
    }
}
