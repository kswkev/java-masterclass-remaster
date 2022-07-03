package academy.learnprogramming;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isPowered;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        isRinging = false;
        isPowered = false;
    }

    @Override
    public void powerOn() {
        if (!isPowered) {
            isPowered = true;
            System.out.println("Mobile turned on");
        } else {
            System.out.println("Mobile is already on");
        }
    }

    @Override
    public void dial(int phoneNumber) {
        if (isPowered) {
            System.out.println("Calling " + phoneNumber);
        } else {
            System.out.println("Mobile is not on");
        }
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
        if (isPowered) {
            dial(phoneNumber);
            return true;
        } else {
            System.out.println("Mobile is not on");
            return false;
        }
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
