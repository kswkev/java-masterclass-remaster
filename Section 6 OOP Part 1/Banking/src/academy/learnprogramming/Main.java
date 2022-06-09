package academy.learnprogramming;

public class Main {

//    	    // Create a new class for a bank account
//        // Create fields for the account number, balance, customer name, email and phone number.
//        //
//        // Create getters and setters for each field
//        // Create two additional methods
//        // 1. To allow the customer to deposit funds (this should increment the balance field).
//        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
//        // but not allow the withdrawal to complete if their are insufficient funds.
//        // You will want to create various code in the Main class (the one created by IntelliJ) to
//        // confirm your code is working.
//        // Add some System.out.println's in the two methods above as well.

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.toString());

        bankAccount.setBalance(100.00);

        System.out.println("new balance set at " + bankAccount.getBalance());

        System.out.println("depositing 10.50");
        bankAccount.depositFunds(10.50);

        System.out.println("depositing -5.00");
        bankAccount.depositFunds(-5.00);

        System.out.println("withdrawing 23.70");
        bankAccount.withdrawFunds(23.70);

        System.out.println("withdrawing -50.00");
        bankAccount.withdrawFunds(-50.00);

        System.out.println("withdrawing 300.00");
        bankAccount.withdrawFunds(300.00);


        VipCustomer vip = new VipCustomer("Kevin", 1000.00, "email@email.com");
        System.out.println(vip.toString());

    }
}
