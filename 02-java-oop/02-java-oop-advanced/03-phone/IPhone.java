public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        String returnStr = "iPhone " + this.versionNumber + " says " + this.ringTone;
        System.out.println(returnStr);
        return returnStr;         
    }
    @Override
    public String unlock() {
        String returnStr = "Unlocking via face recognition";
        System.out.println(returnStr);
        return returnStr;
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + this.versionNumber + " from " + this.carrier);          
    }

}
