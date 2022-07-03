package academy.learnprogramming;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhones are always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Hello ...");
        } else {
            System.out.println("DeskPhone isn't ringing");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        dial(phoneNumber);
        return true;
    }

    @Override
    public boolean isRinging() {
        return this.isRinging;
    }

    @Override
    public void inCommingCall() {
        this.isRinging = true;
    }
}
