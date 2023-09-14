import org.example.Customer;
import org.example.FixedAccount;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FixedAccountTest {
    List<FixedAccount> fixedAccounts = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();
    @BeforeMethod
    public void addCustomers(){
        customers.add(new Customer("Ajay", "Bhat", "Delhi"));
        fixedAccounts.add(new FixedAccount("1223456",10000,3,customers));
    }
    @Test
    public void shouldCreateCustomer(){
        customers.add(new Customer("Arjun", "Reddy", "Delhi"));
        fixedAccounts.add(new FixedAccount("12345",10000,5,customers));
    }
    @Test
    public void shouldDeposit(){
       fixedAccounts.forEach(accounts -> {
           if(accounts.getAccountNumber().equals("1223456")){
               accounts.deposit(1000);
           }
       });
    }
    @Test
    public void shouldNotWithdraw(){
        fixedAccounts.forEach(accounts -> {
            if(accounts.getAccountNumber().equals("1223456")){
                accounts.withdraw(1000);
            }
        });
    }
     @Test
    public void shouldWithdraw(){
        fixedAccounts.forEach(accounts -> {
            if(accounts.getAccountNumber().equals("12345")){
                accounts.withdraw(1000);
            }
        });
    }

}
