package src;

public class DeskPhone implements  Telephone{
String myPhone;
boolean ringing;
    @Override
    public void makeCall(String phoneNo) {
        System.out.println("calling" + phoneNo);
    }

    @Override
    public void receiveCall() {
        System.out.println("receive call");
    }

    @Override
    public boolean isRinging() {
        System.out.println("phone is ringing");
        return ringing;
    }
}



