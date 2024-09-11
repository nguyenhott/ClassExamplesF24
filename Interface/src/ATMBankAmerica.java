public class ATMBankAmerica implements ATM{

    private String pin;
    private String account;
    private double balance;

    public ATMBankAmerica(String pin, String account, double balance){
        this.pin = pin;
        this.account = account;
        this.balance = balance;
    }
    public boolean verifyPIN(String pin){
        if(this.pin.equals(pin))
            return true;
        else return false;
    }

    public boolean withdraw(String account, double amount){
        if(this.account.equals(account)){
            this.balance = this.balance - amount;
            return true;
        }
        else return false;
    }
}
