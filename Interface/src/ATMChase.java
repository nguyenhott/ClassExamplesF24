public class ATMChase implements ATM{

    private String pin;
    private String account;
    private double balance;

    public ATMChase(String pin, String account, double balance){
        this.pin = pin;
        this.account = account;
        this.balance = balance;
    }
    public boolean verifyPIN(String pin){
        if(this.pin.equals(pin) && !this.pin.isEmpty())
            return true;
        else return false;
    }

    public boolean withdraw(String account, double amount){
        if(this.account.equals(account) && this.balance >= amount && amount <=500){
            this.balance = this.balance - amount;
            return true;
        }
        else return false;
    }
}