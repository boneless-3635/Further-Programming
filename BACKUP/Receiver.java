package T11.P3;

public class Receiver extends Thread {
    Channel channel;
    String[] data;

    public Receiver(Channel channel, String[] data) {
        this.channel = channel;
        this.data = data;
    }

    @Override
    public void run() {

    }
}
