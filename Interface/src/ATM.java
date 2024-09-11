public interface ATM {

    boolean verifyPIN(String pin);
    boolean withdraw(String account, double amount);
}
