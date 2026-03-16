import java.util.ArrayList;

public class BankService {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void createAccount(int accNo, String name, double balance) {
        BankAccount acc = new BankAccount(accNo, name, balance);
        accounts.add(acc);
        System.out.println("Account created successfully.");
    }

    public BankAccount findAccount(int accNo) {
        for(BankAccount acc : accounts) {
            if(acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}