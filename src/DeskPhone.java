package src;

public class DeskPhone implements  Telephone{
String myPhone;
boolean ringing;

    public DeskPhone(String myPhone) {
        this.myPhone = myPhone;
//        makeCall(myPhone);
    }

    @Override
    public boolean SwitchOn() {
        System.out.println("Always on");
        return true;
    }

    @Override
    public void makeCall(String phoneNo) {

        System.out.println("calling" + phoneNo);
    }

    @Override
    public void incomingCall(String phoneNo){
      if(phoneNo == myPhone){
          ringing = true;
          System.out.println("incoming call");
      }
      else {
          System.out.println("Wrong number");
      }

    }

    @Override
    public void answer() {
        System.out.println("Answering the call");
    }

    @Override
    public boolean isRinging() {
        if (ringing == true)
        System.out.println("phone is ringing");
        return ringing;
    }
}



