public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "RING RING");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "blrp blrp");

        s9.displayInfo();
        s9.ring();
        s9.unlock();

        iphoneTen.displayInfo();
        iphoneTen.ring();
        iphoneTen.unlock();
    }
}