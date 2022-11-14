package src;

public interface Telephone {
    public boolean SwitchOn();
    public void makeCall(String phoneNo);
    public void incomingCall(String phoneNo);
    public  void answer();
    public  boolean isRinging();
}
