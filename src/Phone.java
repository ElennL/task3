public class Phone {
    private Bluetooth bt;

    public Phone(Bluetooth bt) {
        this.bt = bt;
    }

    public void toConnect(){
        this.bt.connect();
        this.bt.playMusic();
    }

}
