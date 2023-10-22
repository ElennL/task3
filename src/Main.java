public class Main {
    public static void main(String[] args) {
        Headphones headphones = new Headphones();
        Bluetooth adapter = new Driver(headphones);
        Phone phone = new Phone(adapter);
        phone.toConnect();
    }
}


