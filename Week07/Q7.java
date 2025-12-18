package Week07;

public class Q7 {

    public static void main(String[] args) {

     
        BankAccount acc1 = new BankAccount(101, "Aadim", 5000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 3000);

   
        acc1.deposit(2000);
        acc1.withdraw(1000);

       
        acc2.deposit(1500);
        acc2.withdraw(500);

       
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
