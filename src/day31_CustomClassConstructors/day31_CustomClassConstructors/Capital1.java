package day31_CustomClassConstructors.day31_CustomClassConstructors;

public class Capital1 {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setInfo("Antonovici Gabriela", 12345678, 23675);
        System.out.println(account1);
        account1.deposit(12500);
        System.out.println(account1);
        account1.withdraw(6758);
        System.out.println(account1);


        BankAccount account2 = new BankAccount();
        account2.setInfo("Marina",34723684,1509);

        System.out.println(account2);

        account2.deposit(1000);
        System.out.println(account2);
        account2.withdraw(5000);
        System.out.println(account2);

    }
}
