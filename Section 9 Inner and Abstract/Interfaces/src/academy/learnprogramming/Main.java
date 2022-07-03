package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(123456);

        myPhone.inCommingCall();
        myPhone.answer();

        myPhone.callPhone(5558888);

        myPhone = new MobilePhone(123456);

        myPhone.powerOn();
        myPhone.inCommingCall();
        myPhone.answer();

        myPhone.callPhone(5558888);
    }
}
