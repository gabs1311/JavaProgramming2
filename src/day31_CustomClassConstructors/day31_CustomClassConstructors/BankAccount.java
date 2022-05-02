package day31_CustomClassConstructors.day31_CustomClassConstructors;

public class BankAccount {
public String accountHolder;
public long accountNumber;
public double balance;


public void setInfo(String accountHolder, long accountNumber, double balance){
    this.accountHolder= accountHolder;
    this.accountNumber=accountNumber;
    this.balance= balance;
}


    public String toString() {
        return "BankOffer{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Yuor available balance is: $"+ balance);
    }

    public void deposit(double amount){
if (amount<=0){
    System.out.println("Depositing amount cannot be zero or negative");
    return;//exits the method
}
balance+= amount;

    }


    public void withdraw( double amount){
 if(amount >balance){
     System.out.println("Insufficient balance");
     return;// exits the method
 }
 if (amount<=0){
     System.out.println("The withdrawn amount cannot be negative or zero");
 }
    balance-= amount;
    }


}
/*BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount


 */