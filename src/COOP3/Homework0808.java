package COOP3;

/**
 * @author Zhongbo Li
 * @version 1.0
 *
 * 要求
 * 在上面类的基础上扩展 新类 CheckingAccount
 * 对每次存款和取款都收取1美元手续费
 *
 * 扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有
 * 利息产生
 * earnMonthlyInterest方法被调用，并且每月三次免手续费存款或取款，在该方法中
 * 重置交易计数
 * 体会重写的好处
 */
public class Homework0808 {
  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount(1000);
    checkingAccount.deposit(100);
    System.out.println(checkingAccount.getBalance());
    checkingAccount.withdraw(100);
    System.out.println(checkingAccount.getBalance());
    SavingsAccount savingsAccount = new SavingsAccount(1000);
    savingsAccount.deposit(10);
    savingsAccount.withdraw(100);
    savingsAccount.deposit(1000);
    System.out.println(savingsAccount.getBalance());
    savingsAccount.earnMonthlyInterest();
    System.out.println(savingsAccount.getBalance());

  }
}

class BankAccount{
  private double balance;

  public BankAccount(double initbalance) {
    this.balance = initbalance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public  void deposit(double amount){
    balance += amount;
  }
  public void withdraw(double amount){
    balance -= amount;
  }
}
class CheckingAccount extends BankAccount{

  public CheckingAccount(int initbalance) {
    super(initbalance);
  }
  //重写具体方法，直接打方法名回车，然后在方法体里面具体修改
  @Override
  public void deposit(double amount) {
    super.deposit(amount-1);
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount+1);
  }
}

class SavingsAccount extends BankAccount{
  public SavingsAccount(int initbalance) {
    super(initbalance);
  }
  private int month;
  private int times =3;
  @Override
  public void deposit(double amount) {
    if(times > 0){
      super.deposit(amount);
    }else {
      super.deposit(amount -1);
    }
    times--;
  }

  @Override
  public void withdraw(double amount) {
    if(times >0) {
      super.withdraw(amount);
    }else {
      super.withdraw(amount +1);
    }
    times--;//次数需要进行修改
  }

  public void earnMonthlyInterest(){
    times =3;
    super.deposit(getBalance()*1.2); //直接调用存款的父类去乘以利率就算出了每个月的利率
  }
}