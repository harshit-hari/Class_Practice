package src;

public class Main {
    public static void main(String[] args) {
    DeskPhone d1 = new DeskPhone("1234567890");
//    DeskPhone d2 = new DeskPhone("0987654321");
    d1.incomingCall("1234567890");
    if(d1.isRinging() ){
        d1.answer();
    }
    else {
        System.out.println("no incoming call");
    }

    }
}
