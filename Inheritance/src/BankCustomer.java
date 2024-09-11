public class BankCustomer extends Customer{

    private double balance;

    public BankCustomer(String id, String name, String address, double balance){
        super(id, name, address);
        this.balance = balance;
    }
    public boolean withdraw(double amount){
        if(amount <= balance)
        {
            balance = balance - amount;
            return true;
        }
        else return false;
    }
}
