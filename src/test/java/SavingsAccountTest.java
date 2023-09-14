import org.example.Account;
import org.example.Customer;
import org.example.SavingsAccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccountTest {
    List<SavingsAccount> savingsAccount = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    @BeforeMethod
    public void addCustomer() {
        customers.add(new Customer("Ajay", "Bhat", "Delhi"));
        savingsAccount.add(new SavingsAccount("123456789", 2000, customers));
    }

    @Test
    public void shouldDeposit() {
        savingsAccount.forEach(account -> {
            if (account.getAccountNumber().equals("123456789")) {
                account.deposit(1000);
            }
        });
    }

    @Test
    public void shouldWithdraw() {
        savingsAccount.forEach(account -> {
            if (account.getAccountNumber().equals("123456789")) {
                account.withdraw(1000);
            }
        });
    }

    @Test
    public void shouldNotWithdraw() {
        savingsAccount.forEach(account -> {
            if (account.getAccountNumber().equals("123456789")) {
                account.withdraw(3000);
            }
        });
    }

    @Test
    public void shouldCreateCustomerAccount() {
        customers.add(new Customer("Amarendra", "Bahubali", "Mayanagar"));
        savingsAccount.add(new SavingsAccount("1233444", 5000, customers));
        savingsAccount.forEach(account ->{
            System.out.println(account.getAccountNumber());
        });
        System.out.println("Size of the list is : " + savingsAccount.size());
    }

}
