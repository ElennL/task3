public class Driver implements Bluetooth{
    private Headphones headphones;

    public Driver(Headphones headphones) {
        this.headphones = headphones;
    }

    @Override
    public void connect() {
        System.out.println("connected via bt");
        headphones.connectHeadphones();
    }

    @Override
    public void playMusic() {
        System.out.println("playing music");
        headphones.play();
    }
}
