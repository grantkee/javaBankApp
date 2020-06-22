import java.util.Scanner;

public class Bank {
  
  int balance;
  String user;

  Scanner KB=new Scanner(System.in);

  public Bank(int initialBalance, String currentUser){
    balance = initialBalance;
    user = currentUser;
  }

  public void checkBalance(){
    System.out.println("Hello, " + user);
    System.out.println("Your balance is: " + balance);
  }

  //deposit method
  public void deposit(int amountToDeposit){
    int newBalance = amountToDeposit + balance;
    balance = newBalance;
    System.out.println("You just deposited: " + amountToDeposit);
  }

  //withdraw method
  public int withdraw(int amountToWithdraw){
    int newBalance = balance - amountToWithdraw;
    balance = newBalance;
    System.out.println("You just withdrew: " + amountToWithdraw);
    return  amountToWithdraw;
  }

  public static void main(String[] args){
    Bank savings = new Bank(2000, "Grant");
    
    //checking methods
    savings.withdraw(333);
    savings.checkBalance();
    savings.deposit(400);
    savings.checkBalance();
    savings.deposit(100);
    savings.checkBalance();
  }
  
}